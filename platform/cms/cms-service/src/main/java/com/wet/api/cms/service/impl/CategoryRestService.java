package com.wet.api.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.Category;
import com.wet.api.cms.model.wpja.CategoriesWpJaWrapper;
import com.wet.api.cms.rest.wpja.CategoryWpJaRestClient;
import com.wet.api.cms.service.CategoryService;

@Service("categoryRestService")
public class CategoryRestService implements CategoryService
{
	@Autowired
	private CategoryWpJaRestClient<CategoriesWpJaWrapper> categoryWpJaRestClient;
	
	@Override
	public List<Category> findAllCategories()
	{
		return this.categoryWpJaRestClient.getCategoryIndex().getCategories();
	}

	@Override
	public List<Category> findAllSubCategories(int parentId) 
	{
		return this.categoryWpJaRestClient.getSubCategoryIndex(parentId).getCategories();
	}
}