package com.dream.user.service;

import com.dream.user.bo.User;
import com.dream.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> queryUser() {
        return userMapper.queryAllUser();
    }
}
