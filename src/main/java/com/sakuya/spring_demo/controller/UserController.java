package com.sakuya.spring_demo.controller;

import com.sakuya.spring_demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author : sakuya
 * @create 2023/3/3 11:03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/list")
    public Object getUserList(){
        return userService.getUser();
    }

}
