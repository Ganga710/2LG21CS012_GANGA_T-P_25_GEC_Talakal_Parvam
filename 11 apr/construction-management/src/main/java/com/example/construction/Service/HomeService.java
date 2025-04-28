package com.example.construction.Service;

import com.example.construction.model.Project;
import com.example.construction.model.Testimonial;
import com.example.construction.model.Blog;
import com.example.construction.model.Service;
import com.example.construction.model.Gallery;

import java.util.List;

public interface HomeService {
    List<Project> getAllProjects();
    List<Testimonial> getAllTestimonials();
    List<Blog> getAllBlogs();
    List<Service> getAllServices();
    List<Gallery> getAllGalleryImages();
}
