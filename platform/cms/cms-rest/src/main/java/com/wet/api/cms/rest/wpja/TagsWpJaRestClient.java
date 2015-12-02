package com.wet.api.cms.rest.wpja;

import com.wet.api.cms.rest.TagsRestClient;
import com.wet.api.common.model.DomainObject;

public interface TagsWpJaRestClient<T extends DomainObject> extends TagsRestClient<T> 
{
	public T getTagIndex();
}