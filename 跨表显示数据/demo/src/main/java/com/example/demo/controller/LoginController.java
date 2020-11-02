package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.LoginService;
import com.example.demo.utils.MD5Util;
import com.example.demo.utils.Return;
import com.example.demo.utils.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    public ReturnT<User> login(User user, HttpServletRequest request) {
        System.out.println("登录开始=====================" + user.toString());
        user.setPassWord(MD5Util.encode(user.getPassWord()));
        if(loginService.login(user)!=null) {
            //这个判断代表数据库中存在用户输入的那个人
            //这个方法是传进来一个user，到数据进行查询，如果有则返回user，如果没有则为null
            request.getSession(true).setAttribute("userName",user.getUserName());
            //括号中"userName"代表定义的session变量，user.getUserName()代表session变量的值
            return Return.Login(loginService.login(user));
        }
        else {
            return Return.Failed();
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession(true).removeAttribute("userName");
        //移除session
        return "redirect:/login";
    }
}
