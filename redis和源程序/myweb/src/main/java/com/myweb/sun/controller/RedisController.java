package com.myweb.sun.controller;

import com.myweb.sun.utils.RedisHelp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired
    private RedisHelp redisHelp;

    @RequestMapping("/create")
    public void create() {
        System.out.println(redisHelp.create(123));
        System.out.println(redisHelp.create(456));
        //为了将值存到redis中
    }

    @RequestMapping("/get")
    public void get() {
        System.out.println(redisHelp.get(123));
        System.out.println(redisHelp.get(456));
    }

    @RequestMapping("/delete")
    public void delete() {
        redisHelp.delete(123);
        redisHelp.delete(456);
    }

    @RequestMapping("/check")
    public void check() {
        if (redisHelp.check(123, redisHelp.get(456)))
            System.out.println("比对正确");
        else
            System.out.println("比对错误");
    }
}
