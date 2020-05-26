package com.jk.service.service;

import com.jk.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("provider-user2")
public interface UserServiceFeign2 {

    @GetMapping("/test2")
    public void test2();

    // 请求注解：
    // GetMapping  get方式请求  查询
    // PostMapping  post方式请求 新增
    // DeleteMapping delete方式请求 删除
    // PutMapping  put请求  修改

    // 参数注解：
    // RequestParam 传入一个或多个不同类型的参数 http://localhost:8080/test?userName=李伊龙
    // PathVariable 通过地址栏中/传入参数，通过此注解指定别名来接受参数
    //              传参：http://localhost:8080/test/liyilong/28
    //              例如：mapping映射路径 GetMapping("/test/{userName}/{userAge}")
    // RequestBody 用于接受一个实体类对象，传输一个对象的数据需要添加此注解

    @GetMapping("/getUserByName")
    void getUserByName(@RequestParam("userName") String userName);

    @PostMapping("/insertUser")
    User insertUser(@RequestBody User user);
}
