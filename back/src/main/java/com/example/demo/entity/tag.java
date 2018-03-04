package com.example.demo.entity;

public class tag {
    private int ID;
    private String content;
    private int gID;

    public tag() {
    }

    public tag(String content, int gID) {
        this.content = content;
        this.gID = gID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getgID() {
        return gID;
    }

    public void setgID(int gID) {
        this.gID = gID;
    }
}
