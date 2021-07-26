package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WXHang on HANG at 2021/7/27 0:34
 * @author HANG
 */
@Controller
public class AjaxController {
    @ResponseBody
    @RequestMapping("/t1")
    public String Test1(){
        return "hello";
    }
}