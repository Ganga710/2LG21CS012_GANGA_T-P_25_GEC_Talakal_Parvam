package com.example.real.estate.controller;


    import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.real.estate.service.AgentService;

@Controller
public class AgentController {

    @Autowired
    private AgentService agentService;

    @PostMapping("/agentlogin")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        Model model) {

        return agentService.login(email, password)
                .map(agent -> "redirect:/addproperty")
                .orElseGet(() -> {
                    model.addAttribute("error", "Invalid credentials");
                    return "loginagent";
                });
    }

    @GetMapping("/agentlogin")
    public String showLoginPage() {
        return "loginagent";
    }
}



    

