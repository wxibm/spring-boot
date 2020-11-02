package com.myweb.sun.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor extends HandlerInterceptorAdapter {
//    preHandle：在方法被调用前执行。
//    在该方法中可以做类似校验的功能。
//    如果返回true，则继续调用下一个拦截器。
//    如果返回false，则中断执行，也就是说我们想调用的方法不会被执行，
//    但是你可以修改response为你想要的响应。
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果不是映射到方法直接通过
//        if (!(handler instanceof HandlerMethod)) {
//            return true;
//        }
        System.out.println("========方法调用前执行========");
        System.out.println(request.getRequestURI());
        if ((request.getRequestURI()).equals("/get")) {
            return false;
        }
        return super.preHandle(request, response, handler);
    }

//    postHandle：在方法执行后调用。
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("========方法调用后执行========");
        super.postHandle(request, response, handler, modelAndView);
    }

//    afterCompletion：在整个请求处理完毕后进行回调，也就是说视图渲染完毕或者调用方已经拿到响应。
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("========方法处理完毕后执行========");
        super.afterCompletion(request, response, handler, ex);
    }

}
