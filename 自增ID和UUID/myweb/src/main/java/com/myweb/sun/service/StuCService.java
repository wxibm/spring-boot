package com.myweb.sun.service;

import com.myweb.sun.entity.StuC;
import com.myweb.sun.utils.ReturnT;

public interface StuCService {
    public ReturnT<StuC> insert(StuC stuC);
}
