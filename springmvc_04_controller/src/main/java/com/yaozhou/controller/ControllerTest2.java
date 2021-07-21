package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WXHang on HANG at 2021/7/21 23:22
 */
@Controller
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String ControllerTest2(Model model){
        model.addAttribute("msg","ControllerTest2");
        return "test2";
    }
}