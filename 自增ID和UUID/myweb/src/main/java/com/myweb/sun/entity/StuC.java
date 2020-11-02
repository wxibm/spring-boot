package com.myweb.sun.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StuC {
//@JsonProperty注解的作用是：
// 1.前端传参数过来的时候，使用这个注解，可以获取到前端与注解中同名的属性
// 2.后端处理好结果后，返回给前端的属性名也不以实体类属性名为准，而以注解中的属性名为准
    @JsonProperty("StuId")
    private String StuId;
    @JsonProperty("StuName")
    private String StuName;

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String stuId) {
        StuId = stuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String stuName) {
        StuName = stuName;
    }

}
