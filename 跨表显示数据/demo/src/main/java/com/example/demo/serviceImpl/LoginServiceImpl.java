package com.example.demo.serviceImpl;

import com.example.demo.entity.User;
import com.example.demo.mapper.LoginMapper;
import com.example.demo.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//实现层
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;
    public User login(User user) {
        return loginMapper.login(user);
        //直接返回根据用户名和密码得到数据库的数据内容
    }
}
