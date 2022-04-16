package com.example.shuai.system.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangshuaishuai
 * @description 用户角色关联
 * @date 2022/1/17 20:43
 */
@Data
public class UserRole implements Serializable {
    private final long serialVersionUID = 1l;
    private Integer id;
    private Integer roleId;
    private Integer userId;
}
