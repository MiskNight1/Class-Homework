package com.fubukiss.rikky.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fubukiss.rikky.common.CustomException;
import com.fubukiss.rikky.entity.Admin;
import com.fubukiss.rikky.mapper.AdminMapper;
import com.fubukiss.rikky.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService{

    @Resource
    AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin){
        String admin_id = admin.getAdminid();
        Admin info = adminMapper.selectById(admin_id);
        if(info==null||info.getIsdelete()==1){
            log.info("账号不存在");
            return null;
        }
        else if(!info.getPassword().equals(admin.getPassword())){
            log.info("账号或密码错误");
            return null;
        }
        return info;
    }

    @Override
    public Admin register(Admin admin){
        String admin_id = admin.getAdminid();
        String admin_password = admin.getPassword();
        LambdaQueryWrapper<Admin> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Admin::getAdminid,admin_id);
        Admin reg_admin = this.getOne(queryWrapper);
        if(reg_admin==null){
            reg_admin = new Admin();
            reg_admin.setAdminid(admin_id);
            reg_admin.setPassword(admin_password);
            reg_admin.setAdminname(admin.getAdminname());
            this.save(reg_admin);
            return reg_admin;
        }
        else{
            throw new CustomException("已经存在相同账号");
        }

    }
}
