package com.itheima.servletComponent;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by 17081290 on 2021/4/22.
 * 自定义Listener类
// */
@WebListener
//@Component
public class MyListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent){
        System.out.println("contextInitialized......");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("context Destroyed......");
    }

}
