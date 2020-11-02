package com.example.demo.mapper;

import com.example.demo.entity.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface NewsMapper {
    int insert(News news);
    int delete(@Param("id") int id);
    int update(News news);
    News selectByPrimaryKey(@Param("id") String id);
    List<News> getList();
}
