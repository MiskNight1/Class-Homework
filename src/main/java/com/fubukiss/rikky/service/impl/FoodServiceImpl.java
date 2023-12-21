package com.fubukiss.rikky.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fubukiss.rikky.common.CustomException;
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
    public void delete(String f_name){
        LambdaQueryWrapper<Food> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Food::getFoodName,f_name);
        Food info = this.getOne(queryWrapper);
        if(info==null||info.getIsdelete()==1){
            throw new CustomException("没有这个数据或者已被删除");
        }
        //将被删除的设置为1
        UpdateWrapper<Food> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("food_id",info.getFoodId());
        info = new Food();
        info.setIsdelete(1);
        baseMapper.update(info,queryWrapper);

    }
}
