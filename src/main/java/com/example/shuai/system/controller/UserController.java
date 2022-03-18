package com.example.shuai.system.controller;

import com.example.shuai.system.entity.User;
import com.example.shuai.system.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangshuaishuai
 * @description 用户管理
 * @date 2022/1/13 21:01
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public String test(){
        User user = userService.findById(1);
        return user.toString();
    }

}
