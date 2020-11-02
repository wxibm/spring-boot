package com.myweb.sun.service;

import com.myweb.sun.entity.Account;
import com.myweb.sun.mapper.AccountMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountService {
    private static Logger logger = LoggerFactory.getLogger(AccountService.class);
    @Resource
    private AccountMapper accountMapper;

    public Account selectByName(String name) throws Exception {
        try {
            return accountMapper.selectByName(name);
        } catch (Exception e) {
            throw new Exception("数据库异常", e);
        }
    }

    public Account findByName(String name) {
        return accountMapper.selectByName(name);
    }

}