package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/get")
    public String get() {
        return "hello";
    }

    @GetMapping("/getUser")
    public User getUser() {
        return new User("Mike", 25);
    }
}
