package com.example.real.estate.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Property_list")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;          // e.g., "Golden Urban House For Sell"
    private String location;       // e.g., "123 Street, New York, USA"
    private Double price;          // e.g., 12345.0
    private String content;           // e.g., "Apartment", "Villa", "Office"
    private Integer size;          // e.g., 1000 (in sqft)
    private String imageUrl;       // path to image, e.g., "/assets/img/property-1.jpg"
    private String status;         // "For Rent" or "For Sell"

    // Optional fields (if needed for tab 3)
    private Integer beds;
    private Integer baths;

    // Constructors
    public Property() {
    }

    public Property(String title, String location, Double price, Integer size,
                    String imageUrl, String status, Integer beds, Integer baths, String content) {
        this.title = title;
        this.location = location;
        this.price = price;
        this.content = content;
        this.size = size;
        this.imageUrl = imageUrl;
        this.status = status;
        this.beds = beds;
        this.baths = baths;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public Integer getBaths() {
        return baths;
    }

    public void setBaths(Integer baths) {
        this.baths = baths;
    }
}

    

