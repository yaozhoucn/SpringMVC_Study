package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by WXHang on HANG at 2021/7/25 17:30
 * @author HANG
 */
@Controller
public class EncodingController {
    @PostMapping("/c")
    public String test1(String name,Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}