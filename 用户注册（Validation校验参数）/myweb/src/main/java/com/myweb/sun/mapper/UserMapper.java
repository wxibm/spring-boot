package com.myweb.sun.mapper;

import com.myweb.sun.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    int insert(User user);

    User selectByUserName(@Param("userName") String userName);
}