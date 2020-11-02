package com.myweb.sun.controller;

import com.myweb.sun.entity.StuA;
import com.myweb.sun.entity.StuB;
import com.myweb.sun.entity.StuC;
import com.myweb.sun.service.StuAService;
import com.myweb.sun.service.StuBService;
import com.myweb.sun.service.StuCService;
import com.myweb.sun.utils.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class StuController {
    @Autowired
    private StuAService stuAService;
    @Autowired
    private StuBService stuBService;
    @Autowired
    private StuCService stuCService;

    @RequestMapping("/createStuA")
    public ReturnT<StuA> createUser(@RequestBody StuA stuA) {
        return stuAService.insert(stuA);
    }

    @RequestMapping("/createStuB")
    public ReturnT<StuB> createUser(@RequestBody StuB stuB) {
        stuB.setStuId(UUID.randomUUID().toString());
        return stuBService.insert(stuB);
    }

    @RequestMapping("/createStuC")
    public ReturnT<StuC> createUser(@RequestBody StuC stuC) {
        System.out.println(stuC.toString());
        return stuCService.insert(stuC);
//        SELECT UUID(),REPLACE(UUID(), '-', ''),MD5(UUID()),MD5(REPLACE(UUID(),'-',''))
    }
}
