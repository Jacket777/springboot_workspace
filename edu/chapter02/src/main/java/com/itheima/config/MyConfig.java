package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 17081290 on 2021/2/20.
 */
@Configuration//定义该类是一个配置类
public class MyConfig {
    @Bean //将返回值对象作为组件添加到Spring容器中，该组件id默认为方法名
    public MyService myService2(){
        return new MyService();
    }
}
