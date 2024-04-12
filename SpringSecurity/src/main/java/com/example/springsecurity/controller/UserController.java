package com.example.springsecurity.controller;

import com.example.springsecurity.entity.User;
import com.example.springsecurity.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangyaohui
 * @version 0.0.3
 * @description UserController
 * @since 2024/4/12 17:56
 */


@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/hello")
    public User helloWorld(){

        return userService.login("fang");
//        return "Hello World!";
    }


}