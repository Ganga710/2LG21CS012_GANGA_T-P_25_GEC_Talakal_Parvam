package com.example.construction.model;

import jakarta.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and Setters
}
