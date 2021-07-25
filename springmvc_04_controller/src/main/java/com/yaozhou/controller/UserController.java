package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by WXHang on HANG at 2021/7/25 17:07
 * @author HANG
 */
@Controller
public class UserController {
    @RequestMapping("/user")
    public String userTest1(@RequestParam("username") String name, Model model){
        //1.接受前端参数
        System.out.println("前端接收的参数为："+name);

        //2.将结果返回给前端
        model.addAttribute("msg","前端接收的参数为"+name);

        //3.视图跳转
        return "test";
    }
}