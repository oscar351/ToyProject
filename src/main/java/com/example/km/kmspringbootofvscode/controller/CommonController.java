package com.example.km.kmspringbootofvscode.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController{
    
    @RequestMapping(value = "/")
    public String enter() {
        HashMap result = new HashMap();
        result.put("message", "안녕하세요");

        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public HashMap login(@RequestBody String request) {
        System.out.println(request);
        HashMap result = new HashMap();
        result.put("message", "안녕하세요");
        System.out.println("Hello");
        return result;
    }
}