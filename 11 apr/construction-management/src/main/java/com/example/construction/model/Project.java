package com.example.construction.model;

import jakarta.persistence.*;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and Setters
}
