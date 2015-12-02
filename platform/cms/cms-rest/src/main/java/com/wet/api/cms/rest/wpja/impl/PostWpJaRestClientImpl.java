package com.wet.api.cms.rest.wpja.impl;

import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpja.PostWpJaWrapper;
import com.wet.api.cms.rest.wpja.PostWpJaRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("postWpRestClientJa")
public class PostWpJaRestClientImpl extends AbstractSpringRestClient<PostWpJaWrapper> implements PostWpJaRestClient<PostWpJaWrapper>
{
	private static final String METHOD_GET_POST = "get_post";
	
	private static final String PARAM_ID 		= "id";
	private static final String PARAM_SLUG 		= "slug";
	
	public PostWpJaRestClientImpl() 
	{
		super(PostWpJaWrapper.class);
	}
	
	@Override
	public PostWpJaWrapper getPost(long id) 
	{
		setMethod(METHOD_GET_POST);
		putParam(PARAM_ID, id);
		return get();
	}

	@Override
	public PostWpJaWrapper getPost(String slug) 
	{
		setMethod(METHOD_GET_POST);
		putParam(PARAM_SLUG, slug);
		return get();
	}
}