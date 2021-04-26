package com.example.testgk;

import java.io.Serializable;

public class Cloth implements Serializable  {
    private int imgCloth;
    private String name;
    private int price;

    public Cloth(int imgCloth, String name, int price) {
        this.imgCloth = imgCloth;
        this.name = name;
        this.price = price;
    }

    public int getImgCloth() {
        return imgCloth;
    }

    public void setImgCloth(int imgCloth) {
        this.imgCloth = imgCloth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
