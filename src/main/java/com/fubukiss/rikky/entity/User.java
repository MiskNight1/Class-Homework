package com.fubukiss.rikky.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class User {
    //用户id
    private String userId;
    //用户姓名
    private String username;
    //手机号
    private String phonenumber;
    //密码
    private String password;
    // 是否删除(0代表没删除，1代表删除)
    private int isdelete;


}
