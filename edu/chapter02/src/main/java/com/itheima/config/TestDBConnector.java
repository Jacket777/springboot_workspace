package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by 17081290 on 2021/2/20.
 */
@Configuration
@Profile("test")//指定多环境配置类标识
public class TestDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("数据库配置环境test");
    }
}
