package com.itheima.config;

import com.itheima.servletComponent.MyFilter;
import com.itheima.servletComponent.MyListener;
import com.itheima.servletComponent.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


/**
 * Created by 17081290 on 2021/4/22.
* 嵌入式Servlet容器三大组件配置
 */
//@Configuration
//public class ServletConfig {
//    //注册Servlet组件
//    @Bean
//    public ServletRegistrationBean getServlet(MyServlet myServlet){
//        ServletRegistrationBean<MyServlet> registrationBean =
//                new ServletRegistrationBean<>(myServlet, "/myServlet");
//        return registrationBean;
//    }
//
//
////    //注册Filter组件
//    @Bean
//    public FilterRegistrationBean getFilter(MyFilter filter){
//        FilterRegistrationBean<MyFilter> registrationBean = new FilterRegistrationBean<>(filter);
//        registrationBean.setUrlPatterns(Arrays.asList("/toLoginPage","/myFilter"));
//        return registrationBean;
//    }
//
//
//    //注册Listener组件
//    @Bean
//    public ServletListenerRegistrationBean getServletListener(MyListener myListener){
//        ServletListenerRegistrationBean<MyListener> registrationBean = new ServletListenerRegistrationBean<>(myListener);
//        return registrationBean;
//    }
//}
