package com.example.springsecurity.service.serviceImpl;

import com.example.springsecurity.entity.User;
import com.example.springsecurity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fangyaohui
 * @version 0.0.3
 * @description UserServiceImpl
 * @since 2024/4/12 20:23
 */

@Service
public class UserServiceImpl {

    @Autowired
    private UserMapper userMapper;

    public User login(String username){
        User user = userMapper.findUserByUsername(username);

        return user;
    }


}