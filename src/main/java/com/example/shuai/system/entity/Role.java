package com.example.shuai.system.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangshuaishuai
 * @description 角色
 * @date 2022/1/17 20:42
 */
@Data
public class Role implements Serializable {
    private final long serialVersionUID = 1l;
    private Integer id;
    private String name;
}
