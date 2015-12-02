package com.wet.api.cms.model.wpja;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wet.api.cms.model.Post;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class PostsWpJaWrapper extends AbstractDomainObject
{
	private String status;
	
	private int count;
	
	@JsonProperty("count_total")
	private int countTotal;
	
	private int pages;
	
	private List<Post> posts;
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getCountTotal() {
		return countTotal;
	}
	
	public void setCountTotal(int countTotal) {
		this.countTotal = countTotal;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public List<Post> getPosts() {
		return posts;
	}
	
	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}