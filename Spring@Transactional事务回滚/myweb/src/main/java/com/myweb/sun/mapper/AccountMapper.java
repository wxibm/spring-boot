package com.myweb.sun.mapper;

import com.myweb.sun.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface AccountMapper {

    @Select("select * from tb_account")
    List<Account> getAccount();

    @Update("update tb_account set balance = balance+100 where account_id=1")
    void addMoney();

    @Update("update tb_account set balance = balance-100 where account_id=2")
    void reduceMoney();
}