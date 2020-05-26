package com.jk.service.service;

import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("provider-user")
public interface UserServiceFeign {

    @GetMapping("/test")
    public void test();

    @GetMapping("/selectUserList")
    List<User> selectUserList();
}
