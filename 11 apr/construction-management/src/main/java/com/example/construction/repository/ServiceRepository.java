package com.example.construction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.construction.model.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {}