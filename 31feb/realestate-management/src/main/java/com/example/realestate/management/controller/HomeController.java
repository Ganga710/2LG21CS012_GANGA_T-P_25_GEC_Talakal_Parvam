package com.example.realestate.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "about us"; // Create about.html in templates
    }

    @GetMapping("/properties")
    public String properties() {
        return "properties"; // Create properties.html
    }

    @GetMapping("/agents")
    public String agents() {
        return "agents"; // Create agents.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Create contact.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Create login.html
    }
    
}
