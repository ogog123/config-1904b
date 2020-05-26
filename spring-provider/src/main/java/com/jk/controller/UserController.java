package com.jk.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @RequestMapping("name")
    public String username(){
        System.out.println("ss");
        return "罗刚";
    }
}
