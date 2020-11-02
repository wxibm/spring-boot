package com.myweb.sun.controller;

import com.myweb.sun.entity.Account;
import com.myweb.sun.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {
    @SuppressWarnings("all")
    @Autowired
    AccountService accountService;

    @GetMapping("/")
    public List<Account> getAccount() {
        //查询账户
        return accountService.getAccount();
    }

    @GetMapping("/trade")
    public Object tradeMoney() {
        try {
            accountService.tradeMoney();
        } catch (Exception e) {
            return "发生异常了：" + accountService.getAccount();
        }
        return getAccount();
    }
}