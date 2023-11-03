package com.example.km.kmspringbootofvscode.usermanage.model;

import org.springframework.util.MultiValueMap;

public interface OauthParams {
	public OauthProvider oauthProvider();
	public String getAuthorizationCode();
	public MultiValueMap<String, String> makeBody();
}
