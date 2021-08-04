package com.yaozhou.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by WXHang on HANG at 2021/8/4 11:27
 * Desc：
 */
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("loginInterceptor");
        /*if (request.getRequestURI().contains("login")){
            return true;
        }*/

        HttpSession session = request.getSession();
        if (session != null){
            String username = (String) session.getAttribute("username");
            System.out.println(username);
            if ("admin".equals(username)){
                return true;
            }
        }
        /*request.getRequestDispatcher("/user/login").forward(request,response);*/
        response.sendRedirect("/login");
        return false;
    }
}
