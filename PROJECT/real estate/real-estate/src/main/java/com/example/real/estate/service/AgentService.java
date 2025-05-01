package com.example.real.estate.service;


    
    import com.example.real.estate.model.Agent;
import com.example.real.estate.repository.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgentService {

    @Autowired
    private AgentRepository agentRepository;

    public Optional<Agent> login(String email, String password) {
        return agentRepository.findByEmailAndPassword(email, password);
    }
}

