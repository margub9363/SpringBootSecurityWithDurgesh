package com.example.springbootsecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

    @GetMapping("/home")
    public String  home(){
        return "this is a homepage";
    }

    @GetMapping("/login")
    public String  login(){
        return "this is a login page";
    }

    @GetMapping("/register")
    public String  register(){
        return "this is a register page";
    }
}
