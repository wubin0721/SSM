package com.example.ideasprinboot.service.impl;

import com.example.ideasprinboot.bean.TUser;
import com.example.ideasprinboot.mapper.UserMapper;
import com.example.ideasprinboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

      @Autowired
      private UserMapper userMapper;

    @Override
    public TUser getUserById(int id) {
        TUser tuser = userMapper.getUserById(id);
        return tuser;
    }
}
