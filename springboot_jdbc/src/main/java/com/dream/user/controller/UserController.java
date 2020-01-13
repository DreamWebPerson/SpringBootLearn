package com.dream.user.controller;

import com.dream.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("setUser")
    public int setUser(@RequestParam String id, String name, String genner, String password){

        return userService.addUser(id,name,genner,password);
    }

    @RequestMapping("Hellow")
    public String hellow(){

        return "123";
    }

}
