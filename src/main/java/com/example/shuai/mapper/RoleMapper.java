package com.example.shuai.mapper;

import com.example.shuai.system.entity.Role;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    @Select("SELECT * FROM sys_role WHERE id = #{id}")
    Role selectById(Integer id);
}
