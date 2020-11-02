package com.myweb.sun.mapper;

import com.myweb.sun.entity.StuB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StuBMapper {
    int insert(StuB stuB);
}
