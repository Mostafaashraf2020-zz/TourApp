package com.example.project.tourapp;

/**
 * Created by mosta on 1/19/2019.
 */

public class Location {
    String city;
    String region;

    public Location(String city, String region) {
        this.city = city;
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


}
