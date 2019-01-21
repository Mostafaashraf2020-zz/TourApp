package com.example.project.tourapp;

/**
 * Created by mosta on 1/19/2019.
 */

public class BaseModel {
    String name;
    int image;
    Location location;

    public BaseModel() {
    }

    public BaseModel(String name, int image, Location location) {
        this.name = name;
        this.image = image;
        this.location = location;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
