package com.example.km.kmspringbootofvscode.usermanage.model;

public interface OauthMember {
	public String getEmail();
	public String getNickName();
	OauthProvider getOauthProvider();
}
