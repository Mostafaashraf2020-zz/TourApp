package com.example.project.tourapp;

/**
 * Created by mosta on 1/21/2019.
 */

public class ModelHospital {
    public ModelHospital(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    String name;
    Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}
