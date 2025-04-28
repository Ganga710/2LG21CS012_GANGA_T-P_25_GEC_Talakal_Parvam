package com.example.profilecrud.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.profilecrud.model.Profile;
import com.example.profilecrud.service.ProfileService;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/pavi")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("profile",profileService.listAll() );
        return "profile/index"; 
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("profile", new Profile());
        return "profile/create";
    }

    @PostMapping("/save")
    public String saveProfile(
    @RequestParam("name") String name,
    @RequestParam("gender") String gender,
    @RequestParam("color") String color,
    @RequestParam("font") String font,
    @RequestParam("profilepic") MultipartFile profilepic) {
        String uploadDir = new File("src/main/resources/static/upload/").getAbsolutePath();
        try {
        String fileName = profilepic.getOriginalFilename();
        String filePath = uploadDir + File.separator + fileName;
        profilepic.transferTo(new File(filePath));
        Profile stu = new Profile();
        stu.setName(name);
        stu.setGender(gender);
        stu.setColor(color);
        stu.setFont(font);
        stu.setProfilepic("/upload/" + fileName);
        profileService.saveProfile(stu);
    } catch (IOException e) {
        e.printStackTrace();
    }
        return "redirect:/pavi/list";
    }
    
    @GetMapping("/delete/{id}")
    public String deleteProfile(@PathVariable Long id) {
        profileService.deleteProfile(id);
        return "redirect:/pavi/list";
    }
    @GetMapping("/edit/{id}")
    public String editProfile(@PathVariable Long id,Model model) {
        model .addAttribute("profile",profileService.getProfile(id));
        return "profile/edit";
    }
   
    @PostMapping("/update/{id}")
    public String saveProfile(@PathVariable Long id, 
        @ModelAttribute Profile stu) {
           stu.setId(id);
           profileService.saveProfile(stu);
           return "redirect:/pavi/list"; 
        }
    }