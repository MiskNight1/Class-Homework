package com.fubukiss.rikky.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fubukiss.rikky.common.CustomException;
import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.Admin;
import com.fubukiss.rikky.entity.Food;
import com.fubukiss.rikky.mapper.FoodMapper;
import com.fubukiss.rikky.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements FoodService {

    @Resource
    FoodMapper foodMapper;
    @Override
    public R<String> delete(String f_name){
        LambdaQueryWrapper<Food> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Food::getFoodName,f_name);
        Food info = this.getOne(queryWrapper);
        if(info==null||info.getIsdelete()==1){
            return R.error("不存在该记录或者已被删除",0);
        }
        //将被删除的设置为1
        UpdateWrapper<Food> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("food_id",info.getFoodId());
        info = new Food();
        info.setIsdelete(1);
        baseMapper.update(info,queryWrapper);
        return (R.success("删除成功"));
    }

    @Override
    public R<String> add(Food food){
        food.setIsdelete(0);
        if(food.getFoodId()==null&&food.getFoodName()==null){
            return R.error("必须传入餐品名称或id",0);
        }
        String food_name = food.getFoodName();
        String food_id = food.getFoodId();
        LambdaQueryWrapper<Food> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Food::getFoodName,food_name);
        queryWrapper.or().eq(Food::getFoodId,food_id);
        Food info = this.getOne(queryWrapper);
        if(info==null) {
            this.save(food);
            return R.success("插入成功");
        }
        else if(info!=null&&info.getIsdelete()!=0){
            UpdateWrapper<Food> updateWrapper = new UpdateWrapper<>();
            updateWrapper.eq("food_id",info.getFoodId());
            updateWrapper.or().eq("food_name",info.getFoodName());
            updateWrapper.set("introduction",food.getFoodIntroduction());
            updateWrapper.set("photo",food.getPhoto());
            updateWrapper.set("isdelete",food.getIsdelete());
            updateWrapper.set("price",food.getPrice());
            baseMapper.update(food,updateWrapper);
            return R.success("插入成功");
        }
        return R.error("存在相同的数据",0);
    }

}
