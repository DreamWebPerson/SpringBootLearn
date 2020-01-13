package com.dream.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int addUser(String id,String name,String genner,String password){
        int i  = jdbcTemplate.update("insert into demo.demo_user values(?,?,?,?);",id,name,genner,password);
        return i;
    }
}
