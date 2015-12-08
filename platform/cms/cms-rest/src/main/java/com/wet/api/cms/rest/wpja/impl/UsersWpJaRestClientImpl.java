package com.wet.api.cms.rest.wpja.impl;

import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpja.UsersWpJaWrapper;
import com.wet.api.cms.rest.wpja.UserWpJaRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("usersWpJaRestClientImpl")
public class UsersWpJaRestClientImpl extends AbstractSpringRestClient<UsersWpJaWrapper> implements UserWpJaRestClient<UsersWpJaWrapper>
{
	private static final String METHOD_GET_USER_INDEX = "get_author_index";
	
	private String baseUri = System.getenv("OPENSHIFT_WP_BASEURL") + "/api/core/";
	
	@Override
	public String getBaseUri() 
	{
		return baseUri;
	}
	
	public UsersWpJaRestClientImpl() 
	{
		super(UsersWpJaWrapper.class);
	}

	@Override
	public UsersWpJaWrapper getUserIndex() 
	{
		setMethod(METHOD_GET_USER_INDEX);
		return get();
	}
}