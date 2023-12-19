package com.fubukiss.rikky.controller;

import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.Admin;
import com.fubukiss.rikky.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    AdminService adminService;
    @PostMapping("/admin")
    public R<Admin> login_Admin(@RequestBody Admin admin){
        Admin response;
        response = adminService.login(admin);
        if(response!=null)
            return R.success(response);
        return R.error("账号或密码错误");
    }

    @PostMapping("/register")
    public R<Admin> register_Admin(@RequestBody Admin admin){
        Admin response;
        if(admin.getPassword().length()<6){
            return R.error("密码太短");
        }
        response = adminService.register(admin);
        return R.success(response);
    }
}
