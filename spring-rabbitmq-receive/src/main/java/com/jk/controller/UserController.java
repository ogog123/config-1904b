package com.jk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/name")
    public String getUserName(){
        //restful风格
        String userName = restTemplate.getForObject("http://SPRING-PROVIDER/name", String.class);
        return userName;
    }

}
