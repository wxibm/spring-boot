package com.myweb.sun.utils;

public class Return {
    public static <T> ReturnT<T> Success() {
        return new ReturnT<T>().setCode(ReturnCode.SUCCESS.getCode()).setMsg(ReturnCode.SUCCESS.getMsg());
    }

    public static <T> ReturnT<T> Success(T data) {
        return new ReturnT<T>().setCode(ReturnCode.SUCCESS.getCode()).setMsg(ReturnCode.SUCCESS.getMsg()).setData(data);
    }

    public static <T> ReturnT<T> Failed() {
        return new ReturnT<T>().setCode(ReturnCode.FAILED.getCode()).setMsg(ReturnCode.FAILED.getMsg());
    }

    public static <T> ReturnT<T> Failed(T data) {
        return new ReturnT<T>().setCode(ReturnCode.FAILED.getCode()).setMsg(ReturnCode.FAILED.getMsg()).setData(data);
    }
}
