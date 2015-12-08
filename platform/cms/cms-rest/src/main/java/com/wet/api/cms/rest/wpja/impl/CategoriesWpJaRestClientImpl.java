package com.wet.api.cms.rest.wpja.impl;

import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpja.CategoriesWpJaWrapper;
import com.wet.api.cms.rest.wpja.CategoryWpJaRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("categoriesWpJaRestClientImpl")
public class CategoriesWpJaRestClientImpl extends AbstractSpringRestClient<CategoriesWpJaWrapper> implements CategoryWpJaRestClient<CategoriesWpJaWrapper> 
{
	private static final String METHOD_GET_CATEGORY_INDEX = "get_category_index";
	private static final String PARAM_PARENT = "parent";
	
	private String baseUri = System.getenv("OPENSHIFT_WP_BASEURL") + "/api/core/";
	
	public CategoriesWpJaRestClientImpl()
	{
		super(CategoriesWpJaWrapper.class);
	}
	
	@Override
	public String getBaseUri() 
	{
		return baseUri;
	}

	@Override
	public CategoriesWpJaWrapper getCategoryIndex() 
	{
		setMethod(METHOD_GET_CATEGORY_INDEX);
		return get();
	}

	@Override
	public CategoriesWpJaWrapper getSubCategoryIndex(int parentId)
	{
		setMethod(METHOD_GET_CATEGORY_INDEX);
		putParam(PARAM_PARENT, parentId);
		return get();
	}
}