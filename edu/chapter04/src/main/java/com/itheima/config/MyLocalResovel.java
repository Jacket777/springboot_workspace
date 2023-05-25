package com.itheima.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.lang.Nullable;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;


/**
 * Created by 17081290 on 2021/4/22.
 */
@Configuration
public class MyLocalResovel implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取页面手动切换的语言参数I
        String I = request.getParameter("l");
        //获取请求头自动传递的语言参数Accept-Language
        String header = request.getHeader("Accept-Language");
        Locale locale = null;
        if(!StringUtils.isEmpty(I)){
            System.out.println("-------收到手动切换语言请求-----------------");
            //如果手动切换参数不为空，就根据手动参数进行语言切换，否则默认根据请求头信息切换
            String[] split = I.split("_");
            locale = new Locale(split[0], split[1]);
            System.out.println("A1---->"+split[0]);
            System.out.println("A2---->"+split[1]);

        }else{
            //根据请求头信息切换  Accept-Language:en-US
            String[] splits = header.split(",");
            String[] split = splits[0].split("-");
            locale = new Locale(split[0], split[1]);

        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request,
                          @Nullable HttpServletResponse response,
                          @Nullable Locale locale) {
    }

    //将自定义的MyResovel类重新注意一个类型LocalResolver的Bean组件
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResovel();
    }
}
