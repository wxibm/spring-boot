package com.myweb.sun.utils;


public enum ReturnCode {
    SUCCESS("0000","操作成功"),
    FAILED("9999", "操作失败"),
    USERNAME("0001","用户名存在"),
    VALID("1111","参数错误");
    private String code;
    private String msg;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ReturnCode(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}