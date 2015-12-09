package com.wet.api.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.Tag;
import com.wet.api.cms.model.wpja.TagsWpJaWrapper;
import com.wet.api.cms.rest.wpja.TagWpJaRestClient;
import com.wet.api.cms.service.TagService;

@Service("tagRestService")
public class TagRestService implements TagService
{
	@Autowired
	private TagWpJaRestClient<TagsWpJaWrapper> tagWpJaRestClient;
	
	@Override
	public List<Tag> findAllTags() 
	{
		return this.tagWpJaRestClient.getTagIndex().getTags();
	}
}