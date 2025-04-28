package com.example.construction.controller;

import com.example.construction.repository.ProjectRepository;
import com.example.construction.repository.ServiceRepository;
import com.example.construction.repository.TestimonialRepository;
import com.example.construction.repository.BlogRepository;
import com.example.construction.repository.GalleryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {

    @Autowired
    private ProjectRepository projectRepo;

    @Autowired
    private TestimonialRepository testimonialRepo;

    @Autowired
    private BlogRepository blogRepo;
    @Autowired
    private ServiceRepository serviceRepo;
    @Autowired
    private GalleryRepository galleryRepo;



    @GetMapping("/aboutus")
    public String index(Model model) {
        model.addAttribute("projects", projectRepo.findAll());
        model.addAttribute("testimonials", testimonialRepo.findAll());
        model.addAttribute("blogs", blogRepo.findAll());
        model.addAttribute("services", serviceRepo.findAll());
        model.addAttribute("gallery", galleryRepo.findAll());
        return "index";
    }
}
