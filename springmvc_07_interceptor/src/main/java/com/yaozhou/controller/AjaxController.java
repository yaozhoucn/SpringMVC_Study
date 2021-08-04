package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by WXHang on HANG at 2021/7/27 0:34
 * @author HANG
 */
@Controller
public class AjaxController {
    @ResponseBody
    @RequestMapping("/t1")
    public String test1(){
        return "hello";
    }
    @RequestMapping("/a1")
    public void ajaxTest2(@RequestParam("name") String username, HttpServletResponse response) throws IOException {
        if ("yaoshen".equals(username)){
            response.getWriter().print("true");

        } else {
            response.getWriter().print("false");
        }

    }
    @ResponseBody
    @RequestMapping("/a2")
    public String loginTest(String name, String password, HttpServletResponse response){
        String msg = "";
        if (name != null){
            if ("admin".equals(name)) {
                        msg = "ok";
                } else {
                    msg = "用户名有误";
                }

            }
        if (password !=null){
            if ("123456".equals(password)) {
                msg = "ok";
            } else {
                msg = "密码有误";
            }
        }
        System.out.println("msg="+msg);
        return msg;
        }



    @RequestMapping("/login")
    public String login(){

        return "login";
    }
    @ResponseBody
    @RequestMapping("/interceptor")
    public String testInterceptor(){
        return "interceptor";
    }
    @RequestMapping("/user/loginInterceptor")
    public String loginTest(HttpSession session,String username,String password){
        session.setAttribute("username",username);
        System.out.println(username+"===="+password);
        return "redirect:/main";
    }
    @RequestMapping("/main")
    public String main(HttpSession session,String username,String password){
        System.out.println("=============main============");
        return "main";
    }
}