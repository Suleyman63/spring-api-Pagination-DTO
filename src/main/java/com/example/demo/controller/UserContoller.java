package com.example.demo.controller;


import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserContoller {

    private final UserService userService;

    public UserContoller(UserService userService){
        this.userService = userService;
    }
}
