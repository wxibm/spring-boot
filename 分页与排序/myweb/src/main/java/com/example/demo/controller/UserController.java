package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/pageList/{offset}/{pagesize}")
    public Map<String, Object> pageList(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize) {
        return userService.pageList(offset, pagesize);
    }
}