package com.fubukiss.rikky.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Admin {
    //管理员id
    @TableField("admin_id")
    private String adminid;
    //管理员名字
    @TableField("name")
    private String adminname;
    //管理员密码
    private String password;
    //是否删除(删除为1，没删除为0)
    private int isdelete;
}
