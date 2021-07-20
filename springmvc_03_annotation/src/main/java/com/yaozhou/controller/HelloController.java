package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WXHang on HANG at 2021/7/20 22:28
 * @author HANG
 */
@Controller
@RequestMapping("/HelloController")
public class HelloController {

    //真实访问地址：项目名称/HelloController/hello
    @RequestMapping("/hello")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello_springmvc_annotation");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
}