package com.myweb.sun.utils;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ReturnT<T> implements Serializable {

    private static final long serialVersionUID = 2460338858989512546L;
    public String code;

    private String msg;

    private T data;

    public ReturnT<T> setCode(ReturnCode retCode) {
        this.code = retCode.getCode();
        return this;
    }

    public String getCode() {
        return code;
    }

    public ReturnT<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public ReturnT<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }

    public ReturnT<T> setData(T data) {
        this.data = data;
        return this;
    }

}
