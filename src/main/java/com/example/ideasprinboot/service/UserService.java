package com.example.ideasprinboot.service;

import com.example.ideasprinboot.bean.TUser;
import org.apache.ibatis.annotations.Param;


public interface UserService{

    public TUser getUserById(@Param("id") int id);
}
