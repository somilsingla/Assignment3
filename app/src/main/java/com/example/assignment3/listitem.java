package com.example.assignment3;

public class listitem {
    String name;
    String email;
    int image_id;

    public listitem(String name, String email, int image_id) {
        this.name = name;
        this.email = email;
        this.image_id = image_id;
    }

    public listitem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImage_id() {
        return image_id;
    }

    public void setImage_id(int image_id) {
        this.image_id = image_id;
    }
}
