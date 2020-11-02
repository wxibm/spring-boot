package com.example.demo.serviceImpl;

import com.example.demo.entity.News;
import com.example.demo.mapper.NewsMapper;
import com.example.demo.service.NewsService;
import com.example.demo.utils.Return;
import com.example.demo.utils.ReturnT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;

    public ReturnT<News> delete(int id) {
        try {
            newsMapper.delete(id);
            return Return.Success();
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }

    public ReturnT<News> insert(News news) {
        try {
            newsMapper.insert(news);
            return Return.Success(news);
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }

    public ReturnT<News> update(News news) {
        try {
            newsMapper.update(news);
            return Return.Success(news);
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }

    public News selectByPrimaryKey(String id) {
        return newsMapper.selectByPrimaryKey(id);
    }

    public List<News> getList() {
        return newsMapper.getList();
    }
}
