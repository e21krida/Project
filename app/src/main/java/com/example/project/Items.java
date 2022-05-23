package com.example.project;

public class Items {
    private String ID;
    private String Name;
    private String Location;
    private String Category;

    public Items(String ID, String name, String location, String category) {
        this.ID = ID;
        this.Name = name;
        this.Location = location;
        this.Category = category;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        this.Category = category;
    }
}