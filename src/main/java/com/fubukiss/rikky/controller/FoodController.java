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
        Page<Food> pageInfo = new Page<>();
        LambdaQueryWrapper<Food> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.orderByAsc(Food::getFood_id);
        foodService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }


}