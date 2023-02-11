package com.example.springbootsecurity.controllers;

import com.example.springbootsecurity.models.User;
import com.example.springbootsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

//    all users
    @GetMapping("/")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

//    return single user
    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String userName) {
        return this.userService.getUser(userName);
    }

//    adding a user
    @PostMapping("/")
    public User addUser(@RequestBody User user){
        this.userService.addUser(user);
        return user;
    }
}
