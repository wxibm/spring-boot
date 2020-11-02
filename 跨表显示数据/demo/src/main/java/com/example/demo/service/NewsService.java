package com.example.demo.service;

import com.example.demo.entity.News;
import com.example.demo.utils.ReturnT;

import java.util.List;

public interface NewsService {
    public ReturnT<News> insert(News news);
    public ReturnT<News> delete(int id);
    public ReturnT<News> update(News news);
    public News selectByPrimaryKey(String id);
    public List<News> getList();
}
