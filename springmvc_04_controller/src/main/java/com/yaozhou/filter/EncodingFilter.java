package com.yaozhou.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/7/25 17:38
 */
public class EncodingFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        chain.doFilter(request,response);
    }

    public void destroy() {

    }
}