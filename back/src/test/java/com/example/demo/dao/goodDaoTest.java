package com.example.demo.dao;

import com.example.demo.entity.good;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.util.ArrayList;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class goodDaoTest {

    @Autowired
    goodDao goodDao;
    @Test
    public void getGood() {
        try {
            ArrayList<good> goods = goodDao.getGood();
            for (good good : goods) {
                System.out.println(new Gson().toJson(good));
            }
        }catch (Exception e){
            System.out.println("-----------------------------");
            System.out.println(e.getCause());
            System.out.println("----------------------------");
        }
    }
    @Test
    public void addGood() {
        good good=new good("1",2.3,new Date(1));
        goodDao.addGood(good);
        System.out.println(good.getID());
    }

    @Test
    public void deleteGood() {
        goodDao.deleteGood("1");
    }

    @Test
    public void updateGood() {
        good good=new good("1",2.8,new Date(1));
        good.setID(2);
        goodDao.updateGood(good);
    }
}