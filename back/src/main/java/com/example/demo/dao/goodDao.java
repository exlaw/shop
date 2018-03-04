package com.example.demo.dao;

import com.example.demo.entity.good;

import java.util.ArrayList;

public interface goodDao {

    public ArrayList<good> getGood();

    public int addGood(good good);

    public int deleteGood(String ID);

    public int updateGood(good good);
}
