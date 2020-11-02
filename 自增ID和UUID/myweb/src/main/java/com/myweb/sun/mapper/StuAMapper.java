package com.myweb.sun.mapper;

import com.myweb.sun.entity.StuA;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StuAMapper {
    int insert(StuA stuA);
}
