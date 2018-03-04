package com.example.demo.entity;

import java.sql.Date;
import java.util.ArrayList;

public class good {
    private int ID;
    private String name;
    private double price;
    private String description;
    private Date date;
    private String contact;
    private ArrayList<String> tags;
    private ArrayList<String> pictures;

    public good() {}

    public good(String name, double price, Date date) {
        this.name = name;
        this.price = price;
        this.date = date;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<String> getPictures() {
        return pictures;
    }

    public void setPictures(ArrayList<String> pictures) {
        this.pictures = pictures;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return ID+" "+" "+name+" "+price+" "+date;
    }
}
