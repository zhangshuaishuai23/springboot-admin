package com.example.shuai.system.user.service;

import com.example.shuai.mapper.UserMapper;
import com.example.shuai.system.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuaishuai
 * @description 用户管理
 * @date 2022/1/14 20:12
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
