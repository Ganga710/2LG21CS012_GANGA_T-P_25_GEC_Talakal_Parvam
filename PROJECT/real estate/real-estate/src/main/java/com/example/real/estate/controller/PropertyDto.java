package com.example.real.estate.controller;

import org.springframework.web.multipart.MultipartFile;

public class PropertyDto {

    private String title;
    private String content;
    private String price;
    private String areaSize;
    private String address;
    private MultipartFile image;
    private MultipartFile image1;

    // Getters and setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }

    public String getAreaSize() { return areaSize; }
    public void setAreaSize(String areaSize) { this.areaSize = areaSize; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public MultipartFile getImage() { return image; }
    public void setImage(MultipartFile image) { this.image = image; }

    public MultipartFile getImage1() { return image1; }
    public void setImage1(MultipartFile image1) { this.image1 = image1; }
}


