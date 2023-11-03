package com.example.km.kmspringbootofvscode.usermanage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.km.kmspringbootofvscode.common.model.ResResult;
import com.example.km.kmspringbootofvscode.usermanage.model.KakaoParams;
import com.example.km.kmspringbootofvscode.usermanage.service.OauthService;
import com.example.km.kmspringbootofvscode.usermanage.service.UserService;

@RestController
public class UserController {

    @Autowired
	private UserService userservice;

    @Autowired
    private OauthService oauthservice;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResResult login(@RequestBody String request) {

        ResResult resResult = userservice.login(request);

        return resResult;
    }

    @RequestMapping(value = "/login/oauth/kakao", method = RequestMethod.POST)
    public ResponseEntity<String> loginKakao(@RequestBody KakaoParams kakaoParams) {

		String accessToken = oauthservice.getMemberByOauthLogin(kakaoParams);
		//응답 헤더 생성
		HttpHeaders headers = new HttpHeaders();
		headers.set("accessToken", accessToken);
		
		return ResponseEntity.ok().headers(headers).body("Response with header using ResponseEntity");
    }

    
}
