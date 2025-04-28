package com.example.real.estate.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; // points to templates/login.html
    }

   
}

    

