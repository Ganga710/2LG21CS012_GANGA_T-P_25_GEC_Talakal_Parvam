package com.example.construction.model;

import jakarta.persistence.*;

@Entity
public class Gallery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Getters and Setters
}
