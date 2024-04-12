package com.example.springsecurity.mapper;


import com.example.springsecurity.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper{

//  通过username查询用户
    @Select("SELECT * FROM tb_user WHERE username=#{username}")
    User findUserByUsername(String username);

    User findUserById(Long id);

}
