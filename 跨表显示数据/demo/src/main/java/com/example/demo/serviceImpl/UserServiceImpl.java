package com.example.demo.serviceImpl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import com.example.demo.utils.ReturnT;
import com.example.demo.utils.Return;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public ReturnT<User> delete(int id) {
        try {
            userMapper.delete(id);
            return Return.Success();
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }

    public ReturnT<User> update(User user) {
        try {
            userMapper.update(user);
            return Return.Success(user);
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }

    public User selectByPrimaryKey(String id) {
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> getList() {
        return userMapper.getList();
    }

    public Map<String,Object> pageList(int offset, int pagesize) {

        List<User> pageList = userMapper.pageList(offset, pagesize);
        int totalCount = userMapper.pageListCount(offset, pagesize);

        // result
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("pageList", pageList);
        result.put("totalCount", totalCount);

        return result;
    }

}