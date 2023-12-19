package com.fubukiss.rikky.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@Data
public class Food {
    //餐品编号
    @TableField("food_id")
    private String food_id;
    //餐品名称
    @TableField("food_name")
    private String food_name;
    //餐品介绍
    @TableField("introduction")
    private String food_introduction;
    //图片链接
    private String photo;
    //餐品价格
    private BigDecimal price;
    //是否删除(删除为1，未被删除为0)
    private int isdelete;

}
