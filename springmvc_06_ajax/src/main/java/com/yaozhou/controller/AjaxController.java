package com.yaozhou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
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
}