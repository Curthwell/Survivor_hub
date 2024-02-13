package com.example.robot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;




@Entity
    public class Robot{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String id;
        private String category;
        private Location location;

    public Robot() {
    }

    public Robot(String id, String category, Location location) {
        this.id = id;
        this.category = category;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
