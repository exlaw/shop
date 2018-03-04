package com.example.demo.controller;

import com.example.demo.entity.good;
import com.example.demo.service.GoodService;
import com.example.demo.util.wrapper;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class goodController {

    @Autowired
    public GoodService goodService;

    @RequestMapping("/get")
    public String getGood(){
        return new Gson().toJson(goodService.getGood());
    }

    @RequestMapping("/add")
    public int addGood(@RequestBody String in_s){
        wrapper wrapper=new Gson().fromJson(in_s,wrapper.class);
        good g=wrapper.list;
        System.out.println(new Gson().toJson(g));
        goodService.addGood(g);
        return 1;
    }
    @RequestMapping("file")
    public int file(HttpServletRequest request, HttpServletResponse response){
        System.out.println();
        System.out.println("11111");
        return 1;
    }

}
