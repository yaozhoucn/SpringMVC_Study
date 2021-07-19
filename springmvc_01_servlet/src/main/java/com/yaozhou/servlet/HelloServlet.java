package com.yaozhou.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/7/19 16:32
 * Desc：
 */
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String parameter = req.getParameter("method");
        if (parameter.equals("add")){
            req.getSession().setAttribute("msg","执行了add方法");
        }
        if (parameter.equals("delete")){
            req.getSession().setAttribute("msg","执行了delete方法");
        }
        if (("updata").equals(parameter)){
            req.getSession().setAttribute("msg","执行了updata方法");
        }
        req.getRequestDispatcher("login.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
