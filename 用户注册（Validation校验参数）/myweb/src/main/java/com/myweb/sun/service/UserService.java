package com.myweb.sun.service;

import com.myweb.sun.entity.User;
import com.myweb.sun.utils.ReturnT;

//接口层
public interface UserService {
    public ReturnT<User> insert(User user);

    public User selectByUserName(String userName);
}