package com.nf;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "Servlet")
public class Servlet extends javax.servlet.http.HttpServlet {
    ////初始化,当Servlet第一次被创建对象时执行该方法,该方法在整个生命周期中只执行一次
    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("=======init=========");
    }


    //服务,对客户端响应的方法,该方法会被执行多次，每次请求该servlet都会执行该方法
    public void service(ServletRequest arg0, ServletResponse arg1)
            throws ServletException, IOException {
        System.out.println("==========service===========");

    }

    //发生post请求
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("=========发生post请求========");
    }

    //发生post请求
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("=========发生get请求========");
    }
    //销毁,当Servlet被销毁时执行该方法
    public void destroy() {
        System.out.println("========destroy===========");
    }

    //当停止tomcat时也就销毁的servlet。
    public ServletConfig getServletConfig() {
        return  null;
    }
}
