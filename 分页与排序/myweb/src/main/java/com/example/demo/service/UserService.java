package com.example.demo.service;

import java.util.Map;

//接口层
public interface UserService {
    public Map<String,Object> pageList(int offset, int pagesize);
}