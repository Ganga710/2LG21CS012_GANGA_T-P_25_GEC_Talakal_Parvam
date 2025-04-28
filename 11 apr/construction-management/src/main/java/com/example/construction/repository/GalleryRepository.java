package com.example.construction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.construction.model.Gallery;

public interface GalleryRepository extends JpaRepository<Gallery, Long> {}
