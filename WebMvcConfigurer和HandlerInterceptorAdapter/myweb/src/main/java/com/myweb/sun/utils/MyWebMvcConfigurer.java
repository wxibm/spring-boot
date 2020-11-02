package com.myweb.sun.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;


@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    @Autowired
    LoginInterceptor loginInterceptor;

    ////////////////////以下为WebMvcConfigurer常用接口//////////////////////
    /* 拦截器配置 */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        addInterceptor：需要一个实现HandlerInterceptor接口的拦截器实例
//        addPathPatterns：用于设置拦截器的过滤路径规则；
//        addPathPatterns("/**")对所有请求都拦截
//        excludePathPatterns：用于设置不需要拦截的过滤规则
//        拦截器主要用途：进行用户登录状态的拦截，日志的拦截等
//        registry.addInterceptor(loginInterceptor).excludePathPatterns("/login");
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/login", "/logout");
        //login和logout不要走拦截器

//        InterceptorRegistration addInterceptor = registry.addInterceptor(loginInterceptor);
//        // 排除配置
//        addInterceptor.excludePathPatterns("/login", "/logout");
//        // 拦截配置
//        addInterceptor.addPathPatterns("/**");
    }
    /*视图跳转控制器*/
    @Override
    public void addViewControllers(ViewControllerRegistry registry){

    }
    /*静态资源处理*/
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){

    }
    /*默认静态资源处理器*/
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){

    }
    /*这里配置视图解析器*/
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry){

    }
    /*配置内容裁决的一些选项*/
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer){

    }
    /*解决跨域问题*/
    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        super.addCorsMappings(registry);
//        registry.addMapping("/cors/**")
//                .allowedHeaders("*")
//                .allowedMethods("POST","GET")
//                .allowedOrigins("*");
    }
    ////////////////////以下为WebMvcConfigurer所有接口//////////////////////
/*  void configurePathMatch(PathMatchConfigurer var1);

    void configureContentNegotiation(ContentNegotiationConfigurer var1);

    void configureAsyncSupport(AsyncSupportConfigurer var1);

    void configureDefaultServletHandling(DefaultServletHandlerConfigurer var1);

    void addFormatters(FormatterRegistry var1);

    void addInterceptors(InterceptorRegistry var1);

    void addResourceHandlers(ResourceHandlerRegistry var1);

    void addCorsMappings(CorsRegistry var1);

    void addViewControllers(ViewControllerRegistry var1);

    void configureViewResolvers(ViewResolverRegistry var1);

    void addArgumentResolvers(List<HandlerMethodArgumentResolver> var1);

    void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> var1);

    void configureMessageConverters(List<HttpMessageConverter<?>> var1);

    void extendMessageConverters(List<HttpMessageConverter<?>> var1);

    void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> var1);

    void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> var1);

    Validator getValidator();

    MessageCodesResolver getMessageCodesResolver();
 */
}
