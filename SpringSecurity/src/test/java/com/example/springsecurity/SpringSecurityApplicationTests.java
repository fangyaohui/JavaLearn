package com.example.springsecurity;

import com.example.springsecurity.entity.User;
import com.example.springsecurity.service.serviceImpl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSecurityApplicationTests {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void contextLoads() {
    }

    @Test
    void findUserByUsername(){
        User user = userService.login("fang");
        System.out.println(user.toString());
    }

}
