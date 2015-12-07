package com.wet.api.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wet.api.common.model.impl.AbstractDomainObject;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Comment extends AbstractDomainObject 
{
	private String name;
	private String url;
	private String date;
	private String content;
	private int parent;
	private User user;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date)
	{
		this.date = date;
	}
	
	public String getContent()
	{
		return content;
	}
	
	public void setContent(String content) 
	{
		this.content = content;
	}
	
	public int getParent()
	{
		return parent;
	}
	
	public void setParent(int parent) 
	{
		this.parent = parent;
	}
	
	public User getAuthor()
	{
		return user;
	}
	
	public void setAuthor(User user)
	{
		this.user = user;
	}
}