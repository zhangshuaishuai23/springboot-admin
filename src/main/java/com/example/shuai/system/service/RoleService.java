package com.example.shuai.system.service;

import com.example.shuai.mapper.RoleMapper;
import com.example.shuai.system.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhangshuaishuai
 * @description 角色
 * @date 2022/1/17 22:02
 */
@Service
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    public Role selectById(Integer id){
        return roleMapper.selectById(id);
    }
}
