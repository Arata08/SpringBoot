package com.example.controller;

import com.example.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChenXing
 * 2024/4/12 下午6:42
 * describe：
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private User user;

    @Autowired
    public UserController(User user) {
        this.user = user;
    }

    @GetMapping("/show")
    public User show(){
        return user;
    }
}
