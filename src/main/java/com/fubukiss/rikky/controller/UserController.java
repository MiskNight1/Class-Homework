package com.fubukiss.rikky.controller;

import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.Admin;
import com.fubukiss.rikky.entity.User;
import com.fubukiss.rikky.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
        return R.error("账号或密码错误",300);
    }

    @PostMapping("/register")
    public R<User> register_Admin(@RequestBody User user){
        R<User> response;
        if(user.getPassword().length()<6){
            return R.error("密码太短",300);
        }
        response = user_service.register(user);
        return response;
    }

    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request) {
        // 清理session中保存的当前登陆User的id
        request.getSession().removeAttribute("User"); // 放入的时候是什么名字，就要把什么名字移除
        return R.success("退出成功");
    }

}
