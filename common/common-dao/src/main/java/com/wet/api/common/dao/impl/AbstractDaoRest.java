package com.wet.api.common.dao.impl;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.wet.api.common.model.DomainObject;

public abstract class AbstractDaoRest <T extends DomainObject> extends AbstractDao<T>
{
	public AbstractDaoRest(Class<T> type) 
	{
		super(type);
	}
	
	@Override
	public List<T> findAll()
	{
		// curl -i -X GET http://www.mydreamteacher.com/api/core/get_category_index/
		final String uri = "http://www.mydreamteacher.com/api/core/get_tag_index";
	     
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		 
		System.out.println(result);
		
		System.out.println("Found all successfully!");
		return null;
	}
}