package com.example.shuai.system.user.entity;

import lombok.Data;

/**
 * @author zhangshuaishuai
 * @description 用户表
 * @date 2022/1/14 20:08
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
