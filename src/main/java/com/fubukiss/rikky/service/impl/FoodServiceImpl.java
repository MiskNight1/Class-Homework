package com.fubukiss.rikky.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fubukiss.rikky.entity.Food;
import com.fubukiss.rikky.mapper.FoodMapper;
import com.fubukiss.rikky.service.FoodService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FoodServiceImpl extends ServiceImpl<FoodMapper, Food> implements FoodService {
}
