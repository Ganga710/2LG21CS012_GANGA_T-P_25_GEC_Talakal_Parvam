package com.example.real.estate.controller;


    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgentAuthController {

    @GetMapping("/agentlogin")
    public String loginAgent() {
        return "loginagent"; // returns loginagent.html
    }
    
}

    

