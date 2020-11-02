package com.myweb.sun.controller;
import com.myweb.sun.utils.TokenHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {
    @Autowired
    private TokenHelp tokenHelp;

    @RequestMapping("/login")
    public void login() {
        System.out.println("========请先登录========");
    }

    @RequestMapping("/index")
    public void index(HttpServletResponse response) {
        {
            //登录的逻辑结构
        }
        //以下为登录成功后的代码
        Integer userId=123;

        Cookie c = new Cookie(userId.toString(),tokenHelp.create(userId));//新建一个Cookie对象
        c.setMaxAge(24*60*60);//设置过期时间1天，以秒为单位
        response.addCookie(c); //保存cookie到客户端
        System.out.println("登录成功"+c.getName()+"========"+c.getValue());
        //实际开发中，我们将token存储在浏览器的sessionStorage或者localStorage中
    }

    @RequestMapping("/list")
    public void list() {
        System.out.println("========可以执行这条语句========");
    }

    @RequestMapping("/logout")
    public void logout() {
        Cookie cookie = new Cookie("123", null);
        cookie.setMaxAge(0);
        tokenHelp.delete(123);
        System.out.println("========注销成功========");
    }
}
