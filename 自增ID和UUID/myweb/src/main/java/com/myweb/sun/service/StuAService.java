package com.myweb.sun.service;

import com.myweb.sun.entity.StuA;
import com.myweb.sun.utils.ReturnT;

public interface StuAService {
    public ReturnT<StuA> insert(StuA stuA);
}
