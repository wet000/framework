package com.wet.api.cms.rest.wpja.impl;

import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpja.TagsWpJaWrapper;
import com.wet.api.cms.rest.wpja.TagWpJaRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("tagsWpJaRestClientImpl")
public class TagsWpJaRestClientImpl extends AbstractSpringRestClient<TagsWpJaWrapper> implements TagWpJaRestClient<TagsWpJaWrapper>
{
	private static final String METHOD_GET_TAG_INDEX = "get_tag_index";
	
	public TagsWpJaRestClientImpl() 
	{
		super(TagsWpJaWrapper.class);
	}

	@Override
	public TagsWpJaWrapper getTagIndex() 
	{
		setMethod(METHOD_GET_TAG_INDEX);
		return get();
	}
}