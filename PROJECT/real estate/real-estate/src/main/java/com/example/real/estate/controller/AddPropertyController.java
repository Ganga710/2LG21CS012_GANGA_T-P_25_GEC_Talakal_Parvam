package com.example.real.estate.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddPropertyController {

    @GetMapping("/addproperty")
    public String showAddPropertyForm(Model model) {
        model.addAttribute("property", new PropertyDto());
        return "addproperty"; // loads addproperty.html
    }

    @PostMapping("/addproperty")
    public String handleAddProperty(@ModelAttribute("property") PropertyDto property) {
        // For now, just print the submitted data
        System.out.println("Title: " + property.getTitle());
        System.out.println("Content: " + property.getContent());
        System.out.println("Price: " + property.getPrice());
        System.out.println("Area Size: " + property.getAreaSize());
        System.out.println("Address: " + property.getAddress());

        if (property.getImage() != null) {
            System.out.println("Image file: " + property.getImage().getOriginalFilename());
        }
        if (property.getImage1() != null) {
            System.out.println("Image1 file: " + property.getImage1().getOriginalFilename());
        }

        // Later: save property to database

        return "redirect:/showproperty"; // after submission, redirect to property list
    }
}
