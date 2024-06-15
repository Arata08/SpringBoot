package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ChenXing
 * 2024/4/12 下午4:24
 * describe：
 */
@SpringBootApplication//启动类
public class Main {
    public static void main(String[] args) {
        // 1.创建ioc容器,加载配置  2.启动内置的web服务器
        SpringApplication.run(Main.class,args); //自动创建ioc容器,启动tomcat服务器软件
    }
}