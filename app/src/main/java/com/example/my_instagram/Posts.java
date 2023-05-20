package com.example.my_instagram;

public class Posts {


private int image;
private String username,text;

    public Posts(int image, String username, String text) {
        this.image = image;
        this.username = username;
        this.text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
