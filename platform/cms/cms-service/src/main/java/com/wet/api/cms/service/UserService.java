package com.wet.api.cms.service;

import java.util.List;

import com.wet.api.cms.model.User;
import com.wet.api.common.service.CommonRestService;

public interface UserService extends CommonRestService
{
	public List<User> findAllUsersWithPublishedPosts();
}