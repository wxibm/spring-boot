package com.myweb.sun.serviceImpl;

import com.myweb.sun.entity.User;
import com.myweb.sun.mapper.UserMapper;
import com.myweb.sun.service.UserService;
import com.myweb.sun.utils.ReturnT;
import com.myweb.sun.utils.Return;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

//实现层
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public ReturnT<User> insert(User user) {
        try {
            userMapper.insert(user);
            return Return.Success(user);
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }

    public User selectByUserName(String userName) {
        return userMapper.selectByUserName(userName);
    }
}