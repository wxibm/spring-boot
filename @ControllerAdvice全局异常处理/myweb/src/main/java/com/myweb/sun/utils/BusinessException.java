//package com.myweb.sun.utils;
//
//public class BusinessException extends Exception {
//    private ReturnCode returnCode;
//    private Throwable cause;
//
//    public BusinessException(ReturnCode returnCode) {
//        super(returnCode.getMsg());
//        this.returnCode = returnCode;
//    }
//
//    public BusinessException(ReturnCode returnCode, Throwable cause) {
//        super(returnCode.getMsg(), cause);
//        this.returnCode = returnCode;
//        this.cause = cause;
//    }
//    public BusinessException(Throwable cause) {
//        super(cause);
//        this.cause = cause;
//    }
//
//    public ReturnCode getReturnCode() {
//        return returnCode;
//    }
//}