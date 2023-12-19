package com.fubukiss.rikky.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fubukiss.rikky.entity.User;

public interface UserService extends IService<User> {
    public User login(User user);
}
