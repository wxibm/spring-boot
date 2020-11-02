package com.myweb.sun.serviceImpl;

import com.myweb.sun.entity.StuA;
import com.myweb.sun.mapper.StuAMapper;
import com.myweb.sun.service.StuAService;
import com.myweb.sun.utils.Return;
import com.myweb.sun.utils.ReturnT;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StuAServiceImpl implements StuAService {
    @Resource
    private StuAMapper stuAMapper;

    public ReturnT<StuA> insert(StuA stuA) {
        try {
            stuAMapper.insert(stuA);
            return Return.Success(stuA);
        }
        catch(Exception e) {
            return Return.Failed();
        }
    }
}
