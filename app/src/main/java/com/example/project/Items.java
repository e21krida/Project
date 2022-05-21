package com.example.project;

public class Items {
    private String login;
    private int ID;
    public Items(String login, int ID) {
        this.login = login;
        this.ID = ID;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
