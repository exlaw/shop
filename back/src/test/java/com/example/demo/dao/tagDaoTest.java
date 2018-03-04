package com.example.demo.dao;

import com.example.demo.entity.tag;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class tagDaoTest {

    @Autowired
    tagDao tagDao;

    @Test
    public void getTag() {
        ArrayList<tag> tags=tagDao.getTag();
        for(tag tag:tags){
            System.out.println(new Gson().toJson(tag));
        }
    }

    @Test
    public void addTag() {
        tag tag=new tag("111",1);
        tagDao.addTag(tag);
        System.out.println(tag.getID());
    }
}