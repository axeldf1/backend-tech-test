package com.littlebill.api.controller;

import com.littlebill.api.model.User;
import com.littlebill.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService _userService;

    @PostMapping("/create")
    public void CreateUser(@RequestBody User user){
        _userService.CreateUser(user);
    }

    @PostMapping("/login")
    public boolean LoginUser(@RequestBody String password, String pseudo){
        return _userService.CheckLogin(password, pseudo);
    }
}
