package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

/**
 * Created by 17081290 on 2021/3/17.
 */
//标识一个自定义配置类
@Configuration
public class DataSourceConfig {
    //注入一个DataSource实例对象
    @Bean
    @ConfigurationProperties(prefix ="spring.datasource") //将全局文件中以spring.datasoure开头的属性值注入到getDruid方法返回的DataSource类对象中
    public  DataSource getDruid(){
        return new DruidDataSource();
    }
}
