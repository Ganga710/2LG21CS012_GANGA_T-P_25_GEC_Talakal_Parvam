package com.example.construction.model;

import jakarta.persistence.*;

@Entity
public class Testimonial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and Setters
}
