package com.wet.api.cms.rest.wpja;

import com.wet.api.cms.rest.ArchiveRestClient;
import com.wet.api.common.model.DomainObject;

public interface ArchiveWpJaRestClient<T extends DomainObject> extends ArchiveRestClient<T> 
{
	public T getDateIndex();
}