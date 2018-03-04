package com.example.demo.dao;

import com.example.demo.entity.picture;

import java.util.ArrayList;

public interface pictureDao {
    public ArrayList<picture> getPicture();
    public int addPicture(picture picture);
}
