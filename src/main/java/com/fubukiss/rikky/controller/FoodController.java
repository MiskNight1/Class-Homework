package com.fubukiss.rikky.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.Food;
import com.fubukiss.rikky.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
@RequestMapping("/Category")
public class FoodController {

    @Resource
    FoodService foodService;

    @PostMapping("/Add")
    public R<String> Add(@RequestBody Food food){
        log.info("新增菜品分类");
        foodService.save(food);
        return R.success("添加完成");
    }

    @GetMapping("/page")
    public R<Page> page(int page,int pagesize){
        Page<Food> pageInfo = new Page<>(page,pagesize);
        LambdaQueryWrapper<Food> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Food::getIsdelete,0);
        queryWrapper.orderByAsc(Food::getFoodId);
        foodService.page(pageInfo,queryWrapper);
        System.out.println("ok");
        return R.success(pageInfo);
    }

    @PostMapping("/delete")
    public R<String> delete(@RequestBody Food food){
        R<String> response;
        String f_name = food.getFoodName();
        response= foodService.delete(f_name);
        return response;
    }

    @PostMapping("/update")
    public R<String> update(@RequestBody Food food){
        foodService.updateById(food);
        return R.success("更新成功");
    }

}
