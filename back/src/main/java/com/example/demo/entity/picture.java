package com.example.demo.entity;

public class picture {
    private int pID;
    private String info;
    private int goodID;


    public picture() {
    }

    public picture(String info, int goodID) {
        this.info = info;
        this.goodID = goodID;
    }

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getGoodID() {
        return goodID;
    }

    public void setGoodID(int goodID) {
        this.goodID = goodID;
    }
}
