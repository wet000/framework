package com.wet.api.cms.model;

import com.wet.api.common.model.impl.AbstractDomainObject;

public class Author extends AbstractDomainObject
{
	private String slug;
	private String name;
	private String firstName;
	private String lastName;
	private String nickname;
	private String url;
	private String description;
	
	public String getSlug() 
	{
		return slug;
	}
	
	public void setSlug(String slug) 
	{
		this.slug = slug;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	public String getNickname()
	{
		return nickname;
	}
	
	public void setNickname(String nickname)
	{
		this.nickname = nickname;
	}
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url) 
	{
		this.url = url;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
}