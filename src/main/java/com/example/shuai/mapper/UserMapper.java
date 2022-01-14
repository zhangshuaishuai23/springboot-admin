package com.example.shuai.mapper;

import com.example.shuai.system.user.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findById(Integer id);
}
