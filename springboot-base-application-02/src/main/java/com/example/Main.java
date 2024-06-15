package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ChenXing
 * 2024/4/12 下午5:16
 * describe：
 */
@SpringBootApplication//配置类+自动加载其他启动器配置类（）ioc，扫描当前启动类所在的包和子包的ioc和di注解
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}