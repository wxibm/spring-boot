package com.myweb.sun.serviceImpl;
import com.myweb.sun.entity.StuB;
import com.myweb.sun.mapper.StuBMapper;
import com.myweb.sun.service.StuBService;
import com.myweb.sun.utils.Return;
import com.myweb.sun.utils.ReturnT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuBServiceImpl implements StuBService {
    @Resource
    private StuBMapper stuBMapper;

    public ReturnT<StuB> insert(StuB stuB) {
        try {
            stuBMapper.insert(stuB);
            return Return.Success(stuB);
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }
}