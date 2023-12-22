package com.fubukiss.rikky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fubukiss.rikky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
