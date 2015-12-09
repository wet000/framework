package com.wet.api.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wet.api.common.model.impl.AbstractDomainObject;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ImageAttribute extends AbstractDomainObject 
{
	private String url;
	private int width;
	private int height;
	
	public String getUrl()
	{
		return url;
	}
	
	public void setUrl(String url) 
	{
		this.url = url;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public void setWidth(int width) 
	{
		this.width = width;
	}
	
	public int getHeight() 
	{
		return height;
	}
	
	public void setHeight(int height) 
	{
		this.height = height;
	}
}