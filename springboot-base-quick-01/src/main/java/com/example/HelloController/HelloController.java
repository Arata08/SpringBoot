package com.example.HelloController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.naming.Name;

/**
 * @author ChenXing
 * 2024/4/12 下午4:39
 * describe：
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @Value("${aa.message}")
    private String message;

    @GetMapping(value = "/say")
    public String sayHello(){
        System.out.println(message);
        return "hello springboot!";
    }
}
