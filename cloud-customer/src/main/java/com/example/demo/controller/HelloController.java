package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.HelloFeignService;
import com.example.demo.service.HelloRestTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/19.
 */
@RestController
public class HelloController {

    @Autowired
    HelloRestTemplateService helloRibbonService;

    @Autowired
    HelloFeignService helloFeignService;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello")
    public String hi(@RequestParam String name){
        return helloRibbonService.hiService(name);
    }

    @RequestMapping(value = "/hello1")
    public String hi1(@RequestParam String name){
        User user = new User();
        user.setName(name);
        return helloFeignService.sayHiFromClientOne(user);
    }

    @RequestMapping("/hi")
    public String home(@RequestParam String name) {
        return "hi "+name+",i am from port:" +port;
    }

}
