package com.example.project;

public class Items {
    private String ID;
    private String name;
    private String location;
    private String category;

    public Items(String ID, String name, String location, String category) {
        this.ID = ID;
        this.name = name;
        this.location = location;
        this.category = category;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}