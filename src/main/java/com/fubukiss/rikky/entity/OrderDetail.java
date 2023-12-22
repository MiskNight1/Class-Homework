package com.fubukiss.rikky.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 86152
 * @version 1.0
 * Create by 2023/12/23 1:24
 */
@Data
public class OrderDetail{

    private static final long serialVersionUID = 1L;

    private Long id;

    //名称
    private String name;

    //订单id
    private Long orderId;

    //餐品编号
    private Long foodId;

    //金额
    private BigDecimal amount;

    //图片
    private String photo;
}
