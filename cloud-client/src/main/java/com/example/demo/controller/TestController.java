package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/19.
 */
@RestController
public class TestController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestBody User user) {
        return "hi "+user.getName()+",i am from port:" +port;
    }

}
