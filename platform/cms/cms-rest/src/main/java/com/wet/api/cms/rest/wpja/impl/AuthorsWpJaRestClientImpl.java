package com.wet.api.cms.rest.wpja.impl;

import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpja.AuthorsWpJaWrapper;
import com.wet.api.cms.rest.wpja.AuthorsWpJaRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("authorsWpJaRestClientImpl")
public class AuthorsWpJaRestClientImpl extends AbstractSpringRestClient<AuthorsWpJaWrapper> implements AuthorsWpJaRestClient<AuthorsWpJaWrapper>
{
	private static final String METHOD_GET_AUTHOR_INDEX = "get_author_index";
	
	public AuthorsWpJaRestClientImpl() 
	{
		super(AuthorsWpJaWrapper.class);
	}

	@Override
	public AuthorsWpJaWrapper getAuthorIndex() 
	{
		setMethod(METHOD_GET_AUTHOR_INDEX);
		return get();
	}
}