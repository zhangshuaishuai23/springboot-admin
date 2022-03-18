package com.example.shuai.system.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhangshuaishuai
 * @description 用户表
 * @date 2022/1/14 20:08
 */
@Data
public class User implements Serializable {
    private final long serialVersionUID = 1l;
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
