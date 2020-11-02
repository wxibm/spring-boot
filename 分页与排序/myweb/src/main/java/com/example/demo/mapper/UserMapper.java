package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> pageList(@Param("offset") int offset,
                        @Param("pagesize") int pagesize);

    int pageListCount(@Param("offset") int offset,
                      @Param("pagesize") int pagesize);

}