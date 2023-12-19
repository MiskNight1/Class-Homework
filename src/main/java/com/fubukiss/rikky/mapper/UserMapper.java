package com.fubukiss.rikky.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fubukiss.rikky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * FileName: UserMapper
 * Date: 2023/01/16
 * Time: 20:18
 * Author: river
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from User where user_id =#{user_id}")
    User selectById(String user_id);
}
