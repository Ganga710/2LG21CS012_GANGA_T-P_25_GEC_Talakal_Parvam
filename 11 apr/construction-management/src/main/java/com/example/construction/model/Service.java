package com.example.construction.model;

import jakarta.persistence.*;

@Entity
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and Setters
}