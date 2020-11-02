package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public ReturnT<User> insert(@Validated @RequestBody User user) {
        System.out.println("id==========" + user.getId());
        System.out.println("userName==========" + user.getUserName());
        System.out.println("passWord==========" + user.getPassWord());
        System.out.println("email==========" + user.getEmail());
        return userService.insert(user);
    }

    //postman设置form-data
    @RequestMapping("/delete")
    public ReturnT<User> delete(int id) {
        System.out.println("开始删除数据=========="+id);
        return userService.delete(id);
    }

    @RequestMapping("/delete/{id}")
    public ReturnT<User> deleteByID(@PathVariable("id") int id) {
        System.out.println("开始删除数据==========");
        return userService.delete(id);
    }

    @RequestMapping("/update")
    public ReturnT<User> update(@Validated @RequestBody User user) {
        System.out.println("开始修改数据==========");
        System.out.println("id==========" + user.getId());
        System.out.println("userName==========" + user.getUserName());
        System.out.println("passWord==========" + user.getPassWord());
        System.out.println("email==========" + user.getEmail());
        return userService.update(user);
    }

    @RequestMapping("/getUser")
    public User getUser(String id) {
        System.out.println("得到一个数据=========="+id);
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getUser/{id}")
    public User getUserByID(@PathVariable String id) {
        System.out.println("得到一个数据==========");
        return userService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getAll")
    public List<User> getAll(HttpServletRequest request) {
        System.out.println("得到所有数据==========");
        System.out.println(request.getSession(true).getAttribute("userName"));
        return userService.getList();
    }

    @RequestMapping("/pageList")
    public Map<String, Object> pageList(@RequestParam(required = false, defaultValue = "0") int offset,
                                         @RequestParam(required = false, defaultValue = "10") int pagesize) {
        return userService.pageList(offset, pagesize);
    }
}