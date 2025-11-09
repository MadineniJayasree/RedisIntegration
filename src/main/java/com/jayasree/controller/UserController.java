package com.jayasree.controller;

import com.jayasree.model.User;
import com.jayasree.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/users")
public class UserController {
    @Autowired
    private final UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public User getUserById(int id){
        return userService.getUserById(id);
    }
}
