package com.example.shuai.system.service;

import com.example.shuai.mapper.UserRoleMapper;
import com.example.shuai.system.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhangshuaishuai
 * @description 角色用户关联
 * @date 2022/1/17 22:03
 */
@Service
public class UserRoleService {

    @Autowired
    private UserRoleMapper userRoleMapper;

    public List<UserRole> listByUserId(Integer userId) {
        return userRoleMapper.listByUserId(userId);
    }
}
