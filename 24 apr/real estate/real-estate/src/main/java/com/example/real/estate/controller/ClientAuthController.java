package com.example.real.estate.controller;


    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientAuthController {

    @GetMapping("/clientlogin")
    public String loginClient() {
        return "loginclient"; // points to templates/loginclient.html
    }

    @GetMapping("/client")
    public String clientPage() {
        return "client"; // points to templates/client.html
    }
}
    
