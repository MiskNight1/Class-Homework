package com.fubukiss.rikky.common;

public enum errorcode {
    SUCCESS("成功",0),
    Password_err("密码错误",300),
    Count_err("账号错误",100);
    private final String msg;
    private final int code;

    private errorcode(String msg,int code){
        this.msg = msg;
        this.code = code;
    }

}
