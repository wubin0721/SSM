package com.example.ideasprinboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
* @MapperScan 告诉MyBatis扫描哪个包下面的所有接口
*/
@MapperScan(basePackages = "com.example.ideasprinboot.mapper")
@SpringBootApplication
public class IdeaSprinBootApplication {

    public static void main(String[] args) {
        SpringApplication.run
                (IdeaSprinBootApplication.class, args);
    }

}
