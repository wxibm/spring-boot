package com.myweb.sun.serviceImpl;

import com.myweb.sun.entity.StuC;
import com.myweb.sun.mapper.StuCMapper;
import com.myweb.sun.service.StuCService;
import com.myweb.sun.utils.Return;
import com.myweb.sun.utils.ReturnT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuCServiceImpl implements StuCService {
    @Resource
    private StuCMapper stuCMapper;

    public ReturnT<StuC> insert(StuC stuC) {
        try {
            stuCMapper.insert(stuC);
            return Return.Success(stuC);
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }
}
