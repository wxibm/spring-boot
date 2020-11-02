package com.example.demo.controller;

import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import com.example.demo.utils.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/newsapi")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("/insertNews")
    public ReturnT<News> insert(@Validated @RequestBody News news) {
        System.out.println("开始添加新闻====================");
        return newsService.insert(news);
    }

    @RequestMapping("/getAllNews")
    public List<News> getAll() {
        System.out.println("得到所有数据==========");
        return newsService.getList();
    }

    //postman设置form-data
    @RequestMapping("/deleteNews")
    public ReturnT<News> deleteNews(int id) {
        System.out.println("开始删除数据=========="+id);
        return newsService.delete(id);
    }

    @RequestMapping("/deleteNews/{id}")
    public ReturnT<News> deleteNewsByID(@PathVariable("id") int id) {
        System.out.println("开始删除数据==========");
        return newsService.delete(id);
    }
    @RequestMapping("/updateNews")
    public ReturnT<News> update(@Validated @RequestBody News news) {
        System.out.println("开始修改数据==========");
        return newsService.update(news);
    }

    @RequestMapping("/getNews")
    public News getNews(String id) {
        System.out.println("得到一个数据=========="+id);
        return newsService.selectByPrimaryKey(id);
    }

    @RequestMapping("/getNews/{id}")
    public News getNewsByID(@PathVariable String id) {
        System.out.println("得到一个数据==========");
        return newsService.selectByPrimaryKey(id);
    }

}
