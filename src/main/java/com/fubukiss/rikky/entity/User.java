package com.fubukiss.rikky.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class User {
    //用户id
    @TableField("user_id")
    private String userId;
    //用户姓名
    @TableField("user_name")
    private String userName;
    //手机号
    @TableField("phonenumber")
    private String phoneNumber;
    //密码
    private String password;
    // 是否删除(0代表没删除，1代表删除)
    private int isdelete;


}
