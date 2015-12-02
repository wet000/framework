package com.wet.api.cms.model.wpja;

import java.util.List;

import com.wet.api.cms.model.Author;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class AuthorsWpJaWrapper extends AbstractDomainObject
{
	private String status;
	private int count;
	private List<Author> authors;
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public int getCount() 
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}

	public List<Author> getAuthors() 
	{
		return authors;
	}

	public void setAuthors(List<Author> authors) 
	{
		this.authors = authors;
	}
}