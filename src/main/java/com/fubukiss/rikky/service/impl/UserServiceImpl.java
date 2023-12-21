package com.fubukiss.rikky.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fubukiss.rikky.common.R;
import com.fubukiss.rikky.entity.Admin;
import com.fubukiss.rikky.entity.User;
import com.fubukiss.rikky.mapper.UserMapper;
import com.fubukiss.rikky.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    UserMapper userMapper;
    public User login(User user){
        String user_id = user.getUserId();
        User info = userMapper.selectById(user_id);
        if(info==null||info.getIsdelete()==1) {
            log.info("账号不存在");
            return null;
        }
        else if(!info.getPassword().equals(user.getPassword())){
            log.info("账号或密码错误");
            return null;
        }
        return info;
    }

    @Override
    public R<User> register(User user){
        String user_id = user.getUserId();
        String user_password = user.getPassword();
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUserId,user_id);
        User reg_user = this.getOne(queryWrapper);
        if(reg_user==null){
            reg_user = new User();
            reg_user.setUserId(user_id);
            reg_user.setPassword(user_password);
            reg_user.setUserName(user.getUserName());
            this.save(reg_user);
            return R.success(reg_user);
        }
        return R.error("账号已存在",100);
    }
}
