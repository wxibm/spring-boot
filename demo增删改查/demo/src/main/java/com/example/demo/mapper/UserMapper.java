package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    int insert(User user);

    int delete(@Param("id") int id);

    int update(User user);

    User selectByPrimaryKey(@Param("id") String id);

    List<User> getList();

    List<User> findUserByName(String name);

    List<User> pageList(@Param("offset") int offset,
                        @Param("pagesize") int pagesize);

    int pageListCount(@Param("offset") int offset,
                      @Param("pagesize") int pagesize);

}