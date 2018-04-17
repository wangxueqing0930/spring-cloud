package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Administrator on 2018/3/19.
 */
@FeignClient(value = "service-01",fallback = HelloFeignServiceHsytrix.class)
public interface HelloFeignService {
    /**
     * feign
     * @param user
     * @return
     */
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestBody User user);
}
