package com.example.real.estate.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.real.estate.model.User;
import com.example.real.estate.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class AuthController {
    

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login"; // Assuming your HTML is renamed to "login.html" inside templates
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") @Valid User user, Model model) {
        Optional<User> authenticatedUser = userService.authenticateUser(user.getEmail(), user.getPassword());

        if (authenticatedUser.isPresent()) {
            return "redirect:/dashboard"; // Redirect to dashboard if login is successful
        } else {
            model.addAttribute("error", "Invalid email or password!");
            return "login"; // Back to login page with error
        }
    }
}

    

