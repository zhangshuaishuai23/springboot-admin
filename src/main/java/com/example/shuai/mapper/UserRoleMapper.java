package com.example.shuai.mapper;

import com.example.shuai.system.entity.UserRole;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleMapper {

    List<UserRole> listByUserId(Integer userId);
}
