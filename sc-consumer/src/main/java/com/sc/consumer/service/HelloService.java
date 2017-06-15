package com.sc.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/6/14.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi?name="+name,String.class);
    }
    public String hiService2(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/hi2?name="+name,String.class);
    }
}
