package com.herlambang.canggurestaurants.model;

public class Startup {

    private String name, type, photo, openHours;

    public Startup() {
    }

    public Startup(String name, String type, String photo, String openHours) {
        this.name = name;
        this.type = type;
        this.photo = photo;
        this.openHours = openHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getOpenHours() {
        return openHours;
    }

    public void setOpenHours(String openHours) {
        this.openHours = openHours;
    }
}
