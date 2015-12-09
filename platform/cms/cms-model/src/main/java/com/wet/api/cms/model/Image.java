package com.wet.api.cms.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wet.api.common.model.impl.AbstractDomainObject;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Image extends AbstractDomainObject
{
	private ImageAttribute thumbnail;
	private ImageAttribute medium;
	private ImageAttribute large;
	private ImageAttribute full;
	
	public ImageAttribute getThumbnail()
	{
		return thumbnail;
	}
	
	public void setThumbnail(ImageAttribute thumbnail)
	{
		this.thumbnail = thumbnail;
	}
	
	public ImageAttribute getMedium() 
	{
		return medium;
	}
	
	public void setMedium(ImageAttribute medium)
	{
		this.medium = medium;
	}
	
	public ImageAttribute getLarge()
	{
		return large;
	}
	
	public void setLarge(ImageAttribute large) 
	{
		this.large = large;
	}
	
	public ImageAttribute getFull() 
	{
		return full;
	}
	
	public void setFull(ImageAttribute full) 
	{
		this.full = full;
	}
}