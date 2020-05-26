package com.jk.controller;

import com.jk.model.User;
import com.jk.service.service.UserServiceFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserServiceFeign userServiceFeign;


    @RequestMapping("/test")
    public void test(){
        userServiceFeign.test();
    }

    @RequestMapping("/selectUserList")
    public List<User> selectUserList(){
        return userServiceFeign.selectUserList();
    }


}
