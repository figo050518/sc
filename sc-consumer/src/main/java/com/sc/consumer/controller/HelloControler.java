package com.sc.consumer.controller;

import com.sc.consumer.feignInterface.SchedualServiceHi;
import com.sc.consumer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/14.
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;
    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/hi2")
    public String hi2(@RequestParam String name){
        return helloService.hiService2(name);
    }

    @RequestMapping(value = "/hi3")
    public String hi3(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
