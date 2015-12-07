package com.wet.api.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.User;
import com.wet.api.cms.model.wpja.UsersWpJaWrapper;
import com.wet.api.cms.rest.wpja.UserWpJaRestClient;
import com.wet.api.cms.service.UserService;

@Service("userRestService")
public class UserRestService implements UserService
{
	@Autowired
	private UserWpJaRestClient<UsersWpJaWrapper> userWpJaRestClient;
	
	@Override
	public List<User> findAllUsersWithPublishedPosts()
	{
		return this.userWpJaRestClient.getUserIndex().getUsers();
	}
}