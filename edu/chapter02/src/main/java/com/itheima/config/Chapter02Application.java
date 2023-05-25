package com.itheima.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by 17081290 on 2021/2/20.
 * 启动类
 */
//@ImportResource("classpath:beans.xml") //加载自定义XML配置文件位置
@SpringBootApplication
public class Chapter02Application {
    public static void main(String[] args) {
        SpringApplication.run(Chapter02Application.class,args);
    }
}
