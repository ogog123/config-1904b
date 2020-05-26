package com.jk.controller;

import com.jk.model.User;
import com.jk.service.service.UserServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController implements UserServiceFeign {

    @GetMapping("/test")
    public void test(){
        System.out.println("feign消费服务成功。。。");
    }

    @GetMapping("/selectUserList")
    @Override
    public List<User> selectUserList() {
        List<User> userList = new ArrayList<>();
        userList.add(new User(100, "任迎钦", "河南洛阳"));
        userList.add(new User(101, "欧阳浩", "陕西宝鸡"));
        userList.add(new User(102, "郭宝祥", "山西临汾"));
        return userList;
    }


}
