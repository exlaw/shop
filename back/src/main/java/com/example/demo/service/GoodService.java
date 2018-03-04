package com.example.demo.service;


import com.example.demo.dao.goodDao;
import com.example.demo.dao.pictureDao;
import com.example.demo.dao.tagDao;
import com.example.demo.entity.good;
import com.example.demo.entity.picture;
import com.example.demo.entity.tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;


@Service
public class GoodService {
    @Autowired
    public goodDao goodDao;

    @Autowired
    public pictureDao pictureDao;

    @Autowired
    public tagDao tagDao;

    public ArrayList<good> getGood(){
        return goodDao.getGood();
    }

    public int addGood(good good){
        good.setDate(new Date(System.currentTimeMillis()));
        System.out.println("--------------------");
        System.out.println("add");
        System.out.println("---------------");
        goodDao.addGood(good);
        int gID=good.getID();
        System.out.println(gID);
        for(String tag:good.getTags()){
            tagDao.addTag(new tag(tag,gID));
        }
        for(String p:good.getPictures()){
            pictureDao.addPicture(new picture(p,gID));
        }
        return goodDao.addGood(good);
    }

    //同时更新相应的记录（稍后再写）
    public int updateGood(good good){
        return goodDao.updateGood(good);
    }

    public int deleteGood(String id){
        return goodDao.deleteGood(id);
    }
}
