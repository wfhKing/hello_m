package com.nf;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {
    //初始化,实例化完成之后，马上进行初始化工作调用
    public void init(){
    }

    //销毁，Web容器在卸载Web应用程序前调用
    public void destroy() {
    }

    //过滤,请求路径匹配过滤器的URL映射时调动
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(req, resp);
    }

    //实例化，Web容器在部署Web应用程序时对所有过滤器进行实例化调用
    public void init(FilterConfig config) throws ServletException {

    }

}
