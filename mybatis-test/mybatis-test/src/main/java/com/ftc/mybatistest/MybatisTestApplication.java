package com.ftc.mybatistest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: 冯铁城 [17615007230@163.com]
 * @date: 2024-08-28 20:49:06
 * @describe: 项目启动类
 */
@SpringBootApplication
@MapperScan(basePackages =  {"com.ftc.mybatistest.dao"})
public class MybatisTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MybatisTestApplication.class, args);
    }
}
