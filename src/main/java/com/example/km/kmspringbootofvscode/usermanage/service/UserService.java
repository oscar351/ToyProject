package com.example.km.kmspringbootofvscode.usermanage.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.km.kmspringbootofvscode.common.model.ResResult;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("userService")
public class UserService {

    public ResResult login(String request) {
		ResResult resResult = new ResResult();
		
        Map<String, Object> map = new HashMap<String, Object>();
        ObjectMapper om = new ObjectMapper();

        try{
            map = om.readValue(request, Map.class);
        }catch(Exception e){
            e.getStackTrace();
        }

        HashMap result = new HashMap();
        result.put("message", "안녕하세요");

        resResult.setValue(result);
		return resResult;	//resResult 반환
	}
}
