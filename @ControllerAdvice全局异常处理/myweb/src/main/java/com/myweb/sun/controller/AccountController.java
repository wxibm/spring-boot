package com.myweb.sun.controller;

import com.myweb.sun.entity.Account;
//import com.myweb.sun.utils.BusinessException;
import com.myweb.sun.service.AccountService;
//import com.myweb.sun.utils.Return;
//import com.myweb.sun.utils.ReturnCode;
//import com.myweb.sun.utils.ReturnT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//https://blog.csdn.net/u012326462/article/details/80791455
//https://blog.csdn.net/jwf111/article/details/88571067
@RestController
@RequestMapping("account")
public class AccountController {
    private static  Logger logger = LoggerFactory.getLogger(AccountController.class);
//    @ControllerAdvice，用于全局异常处理，减少代码入侵，必须在controller层抛出来，
//    若异常在代码中被抓住了，没有抛出来，是不起作用的。
    @Autowired
    private AccountService accountService;

//    @RequestMapping(value = "selectByName", method = RequestMethod.POST)
//    public ReturnT<Account> selectByName(@RequestParam String name) throws Exception{
////        name是aaa的有两个，我有Account实体类接受的，一定会报错，bbb的有一个不会报错
////        先让mybatis执行数据库赋值时报错，抛出Exception异常
////        让入参name为空，抛出自定义BusinessException异常
//        logger.info("name="+name);
//        if(name == null || name.equals("")){
//            throw new BusinessException(ReturnCode.FAILED,new NullPointerException());
//        }
//        Account account = null;
//        try {
//            account = accountService.selectByName(name);
//        } catch (Exception e) {
//            throw new BusinessException(e);
//        }
//        return Return.Success(account);
//    }

    @RequestMapping("/findByName")
    public Account findByName(@RequestParam String name) {
        return accountService.findByName(name);
    }

}