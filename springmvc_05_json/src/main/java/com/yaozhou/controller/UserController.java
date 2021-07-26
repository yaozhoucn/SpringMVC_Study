package com.yaozhou.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yaozhou.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WXHang on HANG at 2021/7/26 10:26
 * Desc：
 */
@Controller
public class UserController {
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8" )
    @RequestMapping(value = "/j1")
    @ResponseBody
    //不会走视图解析器，会直接返回一个字符串
    public String jsonTest1() throws JsonProcessingException {
        User user = new User(1,"尧神",18);
        String userString = user.toString();
        ObjectMapper mapper = new ObjectMapper();
        String valueAsString = mapper.writeValueAsString(user);
        return valueAsString;
    }
}
