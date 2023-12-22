package com.fubukiss.rikky.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fubukiss.rikky.entity.OrderDetail;
import com.fubukiss.rikky.mapper.OrderDetailMapper;
import com.fubukiss.rikky.service.OrderDetailService;
import org.springframework.stereotype.Service;

/**
 * @author 86152
 * @version 1.0
 * Create by 2023/12/23 1:41
 */
@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
