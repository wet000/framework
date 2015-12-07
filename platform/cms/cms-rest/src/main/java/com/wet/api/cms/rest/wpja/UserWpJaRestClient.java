package com.wet.api.cms.rest.wpja;

import com.wet.api.cms.rest.UserRestClient;
import com.wet.api.common.model.DomainObject;

public interface UserWpJaRestClient<T extends DomainObject> extends UserRestClient<T> 
{
	public T getUserIndex();
}