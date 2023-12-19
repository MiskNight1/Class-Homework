package com.fubukiss.rikky.controller;

import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.User;
import com.fubukiss.rikky.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/User")
public class UserController {
    @Resource
    UserService user_service;
    @PostMapping("/login")
    public R<User> login_User(@RequestBody User user){
        User response;
        response = user_service.login(user);
        if(response!=null)
            return R.success(response);
        return R.error("账号或密码错误");
    }

}
