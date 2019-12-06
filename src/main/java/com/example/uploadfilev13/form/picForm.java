package com.example.uploadfilev13.form;

import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;


public class picForm {
    private int id;
    private String name;
    MultipartFile image;

    public picForm() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
