package com.fubukiss.rikky.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fubukiss.rikky.entity.Admin;

public interface AdminService extends IService<Admin> {
    public Admin login(Admin admin);

    Admin register(Admin admin);
}
