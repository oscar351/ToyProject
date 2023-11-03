package com.example.km.kmspringbootofvscode.common.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.km.kmspringbootofvscode.common.model.ResResult;
import com.example.km.kmspringbootofvscode.common.service.CommonService;



@RestController
public class CommonController{
    
    @Autowired
	private CommonService commonservice;

    @RequestMapping(value = "/")
    public String enter() {
        HashMap result = new HashMap();
        result.put("message", "안녕하세요");

        return "index";
    }
}