package com.example.demo.dao;

import com.example.demo.entity.picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class pictureDaoTest {

    @Autowired
    pictureDao pictureDao;

    @Test
    public void getPicture() {
        ArrayList<picture> pictures=pictureDao.getPicture();
        System.out.println(pictures.size());
    }

    @Test
    public void addPicture() {
        picture p=new picture("111",2);
        pictureDao.addPicture(p);
        System.out.println(p.getpID());
    }
}