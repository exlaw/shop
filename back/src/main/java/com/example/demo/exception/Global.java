package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class Global {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    private Map<String, Object> exceptionHandler(Exception e){
        Map<String, Object> modelMap = new HashMap<>();

        modelMap.put("success", false);
        modelMap.put("errMsg", e.getMessage());

        return modelMap;
    }
}
