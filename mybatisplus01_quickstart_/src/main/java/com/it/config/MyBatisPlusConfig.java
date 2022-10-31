package com.it.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisPlusConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor (){
        //1、定义拦截器
        MybatisPlusInterceptor m= new MybatisPlusInterceptor();
        //2、添加具体拦截器
        m.addInnerInterceptor(new PaginationInnerInterceptor());
        return m;
    }
}
