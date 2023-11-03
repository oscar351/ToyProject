package com.example.km.kmspringbootofvscode.usermanage.model;

public interface OauthClient {
	public OauthProvider oauthProvider();
	public String getOauthLoginToken(OauthParams oauthParams);
	public OauthMember getMemberInfo(String accessToken);
}