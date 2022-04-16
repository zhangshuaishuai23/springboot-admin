package com.example.shuai.mapper;

import com.example.shuai.system.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findById(Integer id);

    @Select("SELECT * FROM sys_user WHERE userName = #{name}")
    User selectByName(String name);
}
