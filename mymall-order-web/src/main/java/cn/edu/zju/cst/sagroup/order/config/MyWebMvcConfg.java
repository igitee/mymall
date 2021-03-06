package cn.edu.zju.cst.sagroup.order.config;

import cn.edu.zju.cst.sagroup.order.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyWebMvcConfg implements WebMvcConfigurer{

    @Autowired
    private LoginInterceptor loginInterceptor;

    /**
     * 添加自定义登录拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/order/**");
    }
}
