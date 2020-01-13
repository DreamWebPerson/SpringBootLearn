package com.dream.user.controller;

import com.dream.user.bo.User;
import com.dream.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public List<User> quryAllUser(){
        return userService.queryUser();
    }
}
