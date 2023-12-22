package com.fubukiss.rikky.service;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fubukiss.rikky.entity.Orders;


public interface OrdersService extends IService<Orders> {

    /**
     * 用户下单
     *
     * @param orders 订单信息
     */
    void submit(Orders orders);

}