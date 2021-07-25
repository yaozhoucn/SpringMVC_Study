package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by WXHang on HANG at 2021/7/25 14:51
 */
@Controller
public class RestFulController {
    //get方式请求
    //@GetMapping("/restful/{a}/{b}")
    @RequestMapping(value = "/restful/{a}/{b}",method = RequestMethod.GET)
    //http://localhost:8080/restful?a=1&b=2
   /* public String restFulTest(int a, int b, Model model){
        int res = a + b;
        model.addAttribute("msg","res的结果为："+res);
        return "test";
    }*/
    public String restFulTest(@PathVariable int a,@PathVariable int b, Model model){
        int res = a + b;
        model.addAttribute("msg","res的结果为："+res);
        return "test";
    }
}