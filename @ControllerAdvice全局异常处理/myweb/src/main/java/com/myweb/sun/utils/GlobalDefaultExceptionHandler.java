//package com.myweb.sun.utils;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import javax.servlet.http.HttpServletRequest;
//import java.util.Objects;
//
//@RestControllerAdvice
//public class GlobalDefaultExceptionHandler {
////    全局异常GlobalDefaultException，上加注解@RestControllerAdvice，
////    在方法上加注解@ExceptionHandler(value = Exception.class)
////    value表示要捕捉的异常，可以写多个，然后根据异常，就可以在这个方法里面进行处理。
//    private static Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);
//
////    需要配合@ExceptionHandler使用。
////    当将异常抛到controller时,可以对异常进行统一处理,规定返回的json格式或是跳转到一个错误页面
//    @ExceptionHandler(value = Exception.class)
//    public ReturnT<ReturnCode> exceptionHandler(HttpServletRequest request, Exception e) {
//        Throwable throwable = getBusinessException(e);
//        if (!Objects.isNull(throwable)) {
//            ReturnCode returnCode = ((BusinessException) throwable).getReturnCode();
//            if(((BusinessException)throwable).getReturnCode()!=null) {
//                return Return.Failed(returnCode);
//            }
//        }
//        return Return.Failed();
//    }
//
//    private Throwable getBusinessException(Throwable e) {
//        if (e == null) {
//            return null;
//        } else if (e instanceof BusinessException) {
//            if(((BusinessException)e).getReturnCode()!=null) {
//                logger.info(((BusinessException) e).getReturnCode().toString());
//            }
//            e.printStackTrace();
//            Throwable temp = getBusinessException(e.getCause());
//            if (temp == null) {
//                return e;
//            } else {
//                return temp;
//            }
//        } else {
//            e.printStackTrace();
//            return getBusinessException(e.getCause());
//        }
//    }
//
//}