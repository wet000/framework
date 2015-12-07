package com.wet.api.cms.rest.wpja;

import com.wet.api.cms.rest.CategoryRestClient;
import com.wet.api.common.model.DomainObject;

public interface CategoryWpJaRestClient <T extends DomainObject> extends CategoryRestClient<T> 
{
	public T getCategoryIndex();
	public T getSubCategoryIndex(int parentId);
}