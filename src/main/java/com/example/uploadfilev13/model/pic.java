package com.example.uploadfilev13.model;

import javax.persistence.*;
import java.util.IdentityHashMap;

@Entity
@Table(name = "pics")
public class pic {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name, image;

    public pic() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
