package com.myweb.sun.mapper;

import com.myweb.sun.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface AccountMapper {
    Account selectByName(@Param("name") String name);
}