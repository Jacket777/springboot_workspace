package com.itheima.servletComponent;

import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.OverridesAttribute;
import java.io.IOException;

/**
 * Created by 17081290 on 2021/4/22.
 * 自定义Servlet类
 */
@WebServlet("/annotationServlet") //路径扫描方式整合
//@Component
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
        resp.getWriter().write("hello MyServlet");
    }
}
