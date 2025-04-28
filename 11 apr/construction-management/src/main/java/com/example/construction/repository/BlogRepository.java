package com.example.construction.repository;

import com.example.construction.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {}
