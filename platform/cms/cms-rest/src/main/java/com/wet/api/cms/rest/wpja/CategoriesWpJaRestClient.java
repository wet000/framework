package com.wet.api.cms.rest.wpja;

import com.wet.api.cms.rest.CategoriesRestClient;
import com.wet.api.common.model.DomainObject;

public interface CategoriesWpJaRestClient <T extends DomainObject> extends CategoriesRestClient<T> 
{
	public T getCategoryIndex();
	public T getSubCategoryIndex(int parentId);
}