package com.example.real.estate.repository;

import com.example.real.estate.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    Optional<Agent> findByEmailAndPassword(String email, String password);
}