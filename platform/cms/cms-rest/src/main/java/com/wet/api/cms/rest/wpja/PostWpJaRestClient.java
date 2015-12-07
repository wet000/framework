package com.wet.api.cms.rest.wpja;

import com.wet.api.cms.rest.PostRestClient;
import com.wet.api.common.model.DomainObject;

public interface PostWpJaRestClient <T extends DomainObject> extends PostRestClient<T>
{
	public T getPost(long postId);
	public T getPost(String postSlug);
}