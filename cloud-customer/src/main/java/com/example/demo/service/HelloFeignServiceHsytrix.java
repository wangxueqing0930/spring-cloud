package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/3/19.
 */
@Component
public class HelloFeignServiceHsytrix implements HelloFeignService{
    @Override
    public String sayHiFromClientOne(User user) {
        return "sorry "+user.getName();
    }
}
