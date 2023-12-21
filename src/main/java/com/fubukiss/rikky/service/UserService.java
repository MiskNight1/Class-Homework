package com.fubukiss.rikky.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.User;

public interface UserService extends IService<User> {
    User login(User user);

    R<User> register(User user);
}
