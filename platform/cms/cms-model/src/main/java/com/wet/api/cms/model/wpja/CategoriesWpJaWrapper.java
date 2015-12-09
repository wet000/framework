package com.wet.api.cms.model.wpja;

import java.util.List;

import com.wet.api.cms.model.Category;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class CategoriesWpJaWrapper extends AbstractDomainObject
{
	private String status;
	private int count;
	private List<Category> categories;
	
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
	
	public List<Category> getCategories()
	{
		return categories;
	}
	
	public void setCategories(List<Category> categories)
	{
		this.categories = categories;
	}
}