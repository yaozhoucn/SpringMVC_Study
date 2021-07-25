package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/7/25 16:43
 */
@Controller
public class ModelAndView {
    @RequestMapping("/m1/v1")
    public void ModelAndViewTest1(HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {
        model.addAttribute("msg","ModelAndViewTest1");
        //request.getRequestDispatcher("/index.jsp").forward(request,response);
        response.sendRedirect("/index.jsp");
    }
    @RequestMapping("/m1/v2")
    public void ModelAndViewTest2(HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {
        model.addAttribute("msg","ModelAndViewTest1");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
        //response.sendRedirect("/index.jsp");
    }
    @RequestMapping("/m2/v2")
    /**
     * 请求转发
     */
    public String ModelAndViewTest3(HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {
        model.addAttribute("msg","ModelAndViewTest3");
        return "forward:/WEB-INF/jsp/test.jsp";
    }
    @RequestMapping("/m2/v3")
    /**
     * 重定向
     */
    public String ModelAndViewTest4(HttpServletRequest request, HttpServletResponse response, Model model) throws ServletException, IOException {
        model.addAttribute("msg","ModelAndViewTest3");
        return "redirect:/index.jsp";
    }
}