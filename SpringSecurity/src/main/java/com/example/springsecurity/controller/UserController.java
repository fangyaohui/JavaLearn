package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
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

    @RequestMapping("/hello")
    public String helloWorld(){

        return "Hello World!";
    }


}