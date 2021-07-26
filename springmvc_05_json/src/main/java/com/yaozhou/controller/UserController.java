package com.yaozhou.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yaozhou.pojo.User;
import com.yaozhou.utils.JsonUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by WXHang on HANG at 2021/7/26 10:26
 * Desc：
 */

//@Controller
@RestController //所有方法都只返回字符串，不走视图解析器
public class UserController {
    //@RequestMapping(value = "/j1",produces = "application/json;charset=utf-8" )
    @RequestMapping(value = "/j1")
    @ResponseBody
    //不会走视图解析器，会直接返回一个字符串
    public String jsonTest1() throws JsonProcessingException {
        User user = new User(1,"尧神",18);
        String userString = user.toString();
        //jackson对象转换json

        String json = JsonUtils.getJson(user);
        return json;
    }
    @RequestMapping(value = "/j2")
    @ResponseBody
    //不会走视图解析器，会直接返回一个字符串
    public String jsonTest2() throws JsonProcessingException {
        List<User> users = new ArrayList<User>();
        User user1 = new User(1,"尧神1",18);
        User user2 = new User(2,"尧神2",18);
        User user3 = new User(3,"尧神3",18);
        User user4 = new User(4,"尧神4",18);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        String userString = users.toString();
        //jackson对象转换json
        ObjectMapper mapper = new ObjectMapper();
        String valueAsString = mapper.writeValueAsString(users);
        return valueAsString;
    }
    @RequestMapping(value = "/j3")
    @ResponseBody
    //不会走视图解析器，会直接返回一个字符串
    public String jsonTest3() throws JsonProcessingException {
        /*ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        //LocalDateTime dateTime = LocalDateTime.now();
        //System.out.println(dateTime);
        String str = mapper.writeValueAsString(df.format(new Date()));
        //使用jackson解决时间戳的问题
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        Date date1 = new Date();
        String stringDate = mapper.writeValueAsString(date1);*/
        String json = JsonUtils.getJson(new Date(), "yyyy-MM-dd HH:mm:ss");

        return json;
    }
    @RequestMapping(value = "/j4")
    @ResponseBody
    //不会走视图解析器，会直接返回一个字符串
    public String jsonTest4() throws JsonProcessingException {
        List<User> users = new ArrayList<User>();
        User user1 = new User(1,"尧神1",18);
        User user2 = new User(2,"尧神2",18);
        User user3 = new User(3,"尧神3",18);
        User user4 = new User(4,"尧神4",18);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        String userString = users.toString();
        //jackson对象转换json
        //使用fastjson
        String jsonString = JSON.toJSONString(users);
        System.out.println("===================java对象转json字符串=====================");
        String userList = JSON.toJSONString(users);

        System.out.println("===================json字符串转java对象=====================");
        User user = JSON.parseObject(userList, User.class);

        System.out.println("===================java对象转json对象=====================");
        JSONObject toJSON = (JSONObject) JSON.toJSON(users);

        System.out.println("===================json对象转java对象=====================");
        User javaObject = JSON.toJavaObject(toJSON, User.class);

        return jsonString;
    }
}
