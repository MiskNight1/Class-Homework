package com.fubukiss.rikky.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author 86152
 * @version 1.0
 * Create by 2023/12/23 1:54
 */
@Data
public class ShoppingCart{

    private static final long serialVersionUID = 1L;

    private Long id;

    //名称
    private String name;

    //用户id
    private Long userId;

    //菜品id
    private Long foodId;

    //金额
    private BigDecimal amount;

    //图片
    private String photo;

    //    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}