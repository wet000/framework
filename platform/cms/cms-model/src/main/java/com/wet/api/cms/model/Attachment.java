package com.wet.api.cms.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.wet.api.common.model.impl.AbstractDomainObject;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Attachment extends AbstractDomainObject
{
	private String url;
	private String slug;
	private String title;
	private String description;
	private String caption;
	private int parent;
	private String mimeType;
	private List<Image> image; // Only set if the attachment is an image
	
	public String getUrl() 
	{
		return url;
	}
	
	public void setUrl(String url)
	{
		this.url = url;
	}
	
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
	public String getCaption() {
		return caption;
	}
	
	public void setCaption(String caption)
	{
		this.caption = caption;
	}
	
	public int getParent() 
	{
		return parent;
	}
	
	public void setParent(int parent) 
	{
		this.parent = parent;
	}
	
	public String getMimeType() 
	{
		return mimeType;
	}
	
	public void setMimeType(String mimeType) 
	{
		this.mimeType = mimeType;
	}
	
	public List<Image> getImage()
	{
		return image;
	}
	
	public void setImage(List<Image> image)
	{
		this.image = image;
	}
}