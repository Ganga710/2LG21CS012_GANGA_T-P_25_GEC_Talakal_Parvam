package com.example.real.estate.controller;


    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class RegisterController {

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new UserRegistrationDto());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserRegistrationDto user) {
        // You can add your logic to save the user in the database here!
        System.out.println("New user registered: " + user.getFullname());
        return "redirect:/login"; // after registration, redirect to login page
    }
}

    

