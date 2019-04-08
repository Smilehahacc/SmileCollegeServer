package com.lynn.smilecollege.mapper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//开启通用注解扫描
//@ComponentScan(basePackages = {"com.how2java.springboot"})
@MapperScan(basePackages = {"com.how2java.springboot"})
//@EnableAutoConfiguration
public class Run {

    public static void main(String[] args) {
        SpringApplication.run(Run.class, args);
    }
}
