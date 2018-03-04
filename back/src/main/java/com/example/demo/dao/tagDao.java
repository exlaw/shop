package com.example.demo.dao;

import com.example.demo.entity.tag;

import java.util.ArrayList;

public interface tagDao {
    public ArrayList<tag> getTag();

    public int addTag(tag tag);
}
