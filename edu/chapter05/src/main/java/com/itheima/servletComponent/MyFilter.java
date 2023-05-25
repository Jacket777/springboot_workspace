package com.itheima.servletComponent;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by 17081290 on 2021/4/22.
 */
@WebFilter(value={"/antionLogin","/antionMyFilter"})
//@Component
public class MyFilter implements Filter{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("hello MyFilter");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {
    }
}
