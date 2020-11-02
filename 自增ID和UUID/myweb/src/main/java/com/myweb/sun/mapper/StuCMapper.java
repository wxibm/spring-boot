package com.myweb.sun.mapper;

import com.myweb.sun.entity.StuC;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StuCMapper {
    int insert(StuC stuC);
}
