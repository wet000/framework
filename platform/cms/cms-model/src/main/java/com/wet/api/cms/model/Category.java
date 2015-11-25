package com.wet.api.cms.model;

import com.wet.api.common.model.impl.AbstractDomainObject;

public class Category extends AbstractDomainObject
{
	private String slug;
	private String title;
	private String description;
	private int parent;
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
	
	public int getParent() 
	{
		return parent;
	}
	
	public void setParent(int parent)
	{
		this.parent = parent;
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