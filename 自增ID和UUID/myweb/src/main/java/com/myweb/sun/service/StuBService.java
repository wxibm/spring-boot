package com.myweb.sun.service;

import com.myweb.sun.entity.StuB;
import com.myweb.sun.utils.ReturnT;

public interface StuBService {
    public ReturnT<StuB> insert(StuB stuB);
}
