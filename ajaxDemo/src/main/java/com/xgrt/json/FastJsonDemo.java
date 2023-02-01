package com.xgrt.json;

import com.alibaba.fastjson2.JSON;

public class FastJsonDemo {
    public static void main(String[] args) {
        //1. 将Java对转为JSON字符串
        User user=new User();
        user.setId(1);
        user.setUsername("鑫哥rt666");
        user.setPassword("123456");

        String jsonStr = JSON.toJSONString(user);
        System.out.println(jsonStr);//{"id":1,"password":"123456","username":"鑫哥rt666"}

        //2. 将JSON字符串转为java对象
        User u = JSON.parseObject("{\"id\":1,\"password\":\"123456\",\"username\":\"鑫哥rt666\"}", User.class);
        System.out.println(u);

    }
}
