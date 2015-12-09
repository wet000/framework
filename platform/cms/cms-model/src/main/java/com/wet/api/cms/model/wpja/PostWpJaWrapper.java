package com.wet.api.cms.model.wpja;

import com.wet.api.cms.model.Post;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class PostWpJaWrapper extends AbstractDomainObject
{
	private String status;
	private Post post;
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public Post getPost() 
	{
		return post;
	}

	public void setPost(Post post) 
	{
		this.post = post;
	}
}