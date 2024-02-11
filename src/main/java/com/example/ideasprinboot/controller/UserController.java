package com.example.ideasprinboot.controller;

import com.example.ideasprinboot.bean.TUser;
import com.example.ideasprinboot.mapper.UserMapper;
import com.example.ideasprinboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

/*
* 发送映射请求，返回TUser的json数据
*
*/

    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") int id) {
        TUser tuser = userService.getUserById(id);
        return tuser;
    }
}
