package com.fubukiss.rikky.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.Admin;

public interface AdminService extends IService<Admin> {
    R<Admin> login(Admin admin);

    R<Admin> register(Admin admin);
}
