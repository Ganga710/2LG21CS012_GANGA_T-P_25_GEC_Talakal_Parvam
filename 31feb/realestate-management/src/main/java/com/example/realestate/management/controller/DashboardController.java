package com.example.realestate.management.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DashboardController {
    @GetMapping("/land-search")
    public String showSearchForm() {
        return "land-search"; 
    }

    @GetMapping("/search")
    public String processSearch(
            @RequestParam(required = false) String landSize,
            @RequestParam(required = false) String priceRange,
            @RequestParam(required = false) String location,
            Model model
    ) {
        
        model.addAttribute("landSize", landSize);
        model.addAttribute("priceRange", priceRange);
        model.addAttribute("location", location);

        
        System.out.println("Search: Size=" + landSize + ", Price=" + priceRange + ", Location=" + location);

        return "search-result"; 
    }
    
}
