package com.wet.api.cms.model.wpja;

import java.util.List;

import com.wet.api.cms.model.Tag;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class TagsWpJaWrapper extends AbstractDomainObject 
{
	private String status;
	private int count;
	private List<Tag> tags;
	
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
	
	public List<Tag> getTags() 
	{
		return tags;
	}
	
	public void setTags(List<Tag> tags) 
	{
		this.tags = tags;
	}
}