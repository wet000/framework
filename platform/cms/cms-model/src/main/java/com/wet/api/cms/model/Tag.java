package com.wet.api.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wet.api.common.model.impl.AbstractDomainObject;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Tag extends AbstractDomainObject
{	
	private String slug;
	private String title;
	private String description;
	private int postCount;
	
	public String getSlug() 
	{
		return slug;
	}
	
	public void setSlug(String slug) 
	{
		this.slug = slug;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getDescription() 
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public int getPostCount() 
	{
		return postCount;
	}
	
	public void setPostCount(int postCount) 
	{
		this.postCount = postCount;
	}	
}