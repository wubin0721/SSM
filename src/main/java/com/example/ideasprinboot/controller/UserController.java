package com.example.ideasprinboot.controller;

import com.example.ideasprinboot.bean.TUser;
import com.example.ideasprinboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

/*
* 发送映射请求，返回TUser的json数据
*
*/

    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") int id) {
        TUser tuser = userMapper.getUserById(id);
        return tuser;
    }
}
