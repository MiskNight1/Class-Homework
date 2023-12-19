package com.fubukiss.rikky.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fubukiss.rikky.entity.Food;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface FoodService extends IService<Food> {
    void delete(String f_name);
}
