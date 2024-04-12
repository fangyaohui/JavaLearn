package com.example.springsecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fangyaohui
 * @version 0.0.3
 * @description User
 * @since 2024/4/12 18:24
 */


@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {

    private Long id;

    private String username;

    private String password;

}