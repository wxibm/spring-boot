package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.utils.ReturnT;

import java.util.List;
import java.util.Map;

//接口层
public interface UserService {
    public ReturnT<User> insert(User user);

    public ReturnT<User> delete(int id);

    public ReturnT<User> update(User user);

    public User selectByPrimaryKey(String id);

    public List<User> getList();

    public Map<String,Object> pageList(int offset, int pagesize);
}