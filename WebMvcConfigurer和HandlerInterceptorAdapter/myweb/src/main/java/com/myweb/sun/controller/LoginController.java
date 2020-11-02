package com.myweb.sun.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
//    WebMvcConfigurer：Spring内部的一种配置类
//    HandlerInterceptorAdapter：拦截器

    @RequestMapping("/login")
    public void login() {
        System.out.println("========调用login方法========");
//        login被放行并且输出语句，这类请求不会在后台输出拦截器中的语句。
//        ========调用login方法========
    }

    @RequestMapping("/get")
    public void get() {
        System.out.println("========调用get方法========");
    }

    @RequestMapping("/check")
    public void check() {
        System.out.println("========调用check方法========");
//        check没被放行有对应处理器，这类请求执行一次拦截器的内容。
//          ========方法调用前执行========
//          ========调用check方法========
//          ========方法调用后执行========
//          ========方法处理完毕后执行========

//        none没被放行也没有对应处理器，这类请求执行两次拦截器的内容。
//        ========方法调用前执行========
//        ========方法调用后执行========
//        ========方法处理完毕后执行========
//        ========方法调用前执行========
//        ========方法调用后执行========
//        ========方法处理完毕后执行========

//        logout被放行但没有对应处理器，这类请求执行一次拦截器的内容。
//        ========方法调用前执行========
//        ========方法调用后执行========
//        ========方法处理完毕后执行========
    }

//    @RequestMapping("/logout")
//    public void logout() {
//        System.out.println("========调用logout方法========");
//    }
}
