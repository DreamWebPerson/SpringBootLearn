package com.dream.user.mapper;


import com.dream.user.bo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 查询所有的用户信息
     * */
    List<User> queryAllUser();

    /**
     * 插入用户
     * */
    Integer insertUser(User user);
}
