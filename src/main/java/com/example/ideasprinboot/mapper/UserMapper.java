package com.example.ideasprinboot.mapper;

import com.example.ideasprinboot.bean.TUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    /*
    *每个方法都在Mapper文件中有一个sql
    * 所有参数都应该用@Param进行签名，以后使用指定的名字在SQL中取值
    *
    * @Param id
    * @return
    */
    TUser getUserById(@Param("id") int id);
}
