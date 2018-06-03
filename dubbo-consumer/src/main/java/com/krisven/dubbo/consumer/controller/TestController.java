package com.krisven.dubbo.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.krisven.dubbo.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test/{name}")
    @ResponseBody
    public JSONObject testJson(@PathVariable("name") String name){
        JSONObject jsonObject = new JSONObject();
        String testStr = testService.sayHello(name);
        jsonObject.put("str", testStr);
        return jsonObject;
    }
}
