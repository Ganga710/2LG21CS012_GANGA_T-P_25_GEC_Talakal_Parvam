package com.example.real.estate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index"; // This will return index.html from the templates folder
    }
    @GetMapping("/about")
    public String about() {
        return "about"; // This will return about.html
    }
    @GetMapping("/agent")
    public String showAgentPage() {
        return "agent"; // matches agent.html in templates
    }
    @GetMapping("/property-list")
    public String propertyList() {
        return "property-list"; // This will return property-list.html
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact"; // This will return property-list.html
    }
    

    
}
