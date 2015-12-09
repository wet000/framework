package com.wet.api.cms.rest.wpjau;

import com.wet.api.cms.model.User;
import com.wet.api.cms.model.wpjau.UserWpJauWrapper;
import com.wet.api.cms.rest.UserRestClient;
import com.wet.api.common.model.DomainObject;

public interface UserWpJauRestClient <T extends DomainObject> extends UserRestClient<T>
{
	public void register(User user);
	public void save(User user);
	public void authenticateUser(String username, String password);
	public UserWpJauWrapper getUser();
}