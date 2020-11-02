package com.myweb.sun.service;

import com.myweb.sun.entity.Account;
import com.myweb.sun.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

@Service
public class AccountService {
    @SuppressWarnings("all")
    @Autowired
    AccountMapper accountMapper;

    public List<Account> getAccount() {
        return accountMapper.getAccount();
    }

    //正确
    @Transactional
    public void tradeMoney() throws Exception {
        //先增加余额
        accountMapper.reduceMoney();
        accountMapper.addMoney();
        //然后遇到故障
        throw new RuntimeException("发生异常了..");
    }

    //正确
//    @Transactional(rollbackFor = SQLException.class)
//    public void tradeMoney() throws Exception {
//        //2转账给1
//        accountMapper.reduceMoney();
//        accountMapper.addMoney();
//        //然后遇到故障
//        throw new SQLException("发生异常了..");
//    }

//    Spring的默认的事务规则是遇到运行异常（RuntimeException）和程序错误（Error）才会回滚。
//    如果想针对非检测异常进行事务回滚，可以在@Transactional 注解里使用rollbackFor 属性明确指定异常

    //错误
//    @Transactional
//    public void tradeMoney() throws Exception {
//        //2转账给1
//        accountMapper.reduceMoney();
//        accountMapper.addMoney();
//        //然后遇到故障
//        throw new SQLException("发生异常了..");
//    }
}