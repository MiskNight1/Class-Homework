package com.fubukiss.rikky.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author 86152
 * @version 1.0
 * Create by 2023/12/23 1:17
 */
@Data
public class Orders{

    private static final long serialVersionUID = 1L;

    //订单id
    private Long id;

    //订单号（其实就是String的id，但是怕删掉会引发不知名的错误，先不删了，请求的时候这个可以不用写）
    private String number;

    //订单状态 1待付款，2待派送，3已派送，4已完成，5已取消
    private Integer status;

    //下单用户id
    private Long userId;

    //地址id
    private Long addressBookId;


    //下单时间
    private LocalDateTime orderTime;


    //结账时间
    private LocalDateTime checkoutTime;


    //实收金额
    private BigDecimal amount;

    //备注
    private String remark;

    //用户名
    private String userName;

    //手机号
    private String phone;

    //地址
    private String address;

    //收货人
    private String consignee;
}