package com.example.real.estate.controller;

import com.example.real.estate.service.TestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestimonialController {

    @Autowired
    private TestimonialService testimonialService;

    @GetMapping("/testimonial")
    public String showTestimonials(Model model) {
        model.addAttribute("testimonials", testimonialService.getAllTestimonials());
        return "testimonial"; // renders testimonial.html
    }
}