package com.wet.api.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.User;
import com.wet.api.cms.model.wpja.UsersWpJaWrapper;
import com.wet.api.cms.model.wpjau.UserWpJauWrapper;
import com.wet.api.cms.rest.wpja.UserWpJaRestClient;
import com.wet.api.cms.rest.wpjau.UserWpJauRestClient;
import com.wet.api.cms.service.UserService;

@Service("userRestService")
public class UserRestService implements UserService
{
	@Autowired
	private UserWpJaRestClient<UsersWpJaWrapper> userWpJaRestClient;
	
	@Autowired
	private UserWpJauRestClient<UserWpJauWrapper> userWpJauRestClientImpl;

	@Override
	public void register(User user)
	{
		userWpJauRestClientImpl.register(user);
	}

	@Override
	public void save(User user) 
	{
		userWpJauRestClientImpl.save(user);
	}

	@Override
	public User login(String username, String password)
	{
		userWpJauRestClientImpl.authenticateUser(username, password);
		return userWpJauRestClientImpl.getUser().getUser();
	}
	
	@Override
	public User getAuthenticatedUser()
	{
		// TODO: Will need some checks here to make sure a user has been authenticated
		return userWpJauRestClientImpl.getUser().getUser();
	}
	
	@Override
	public List<User> findAllUsersWithPublishedPosts()
	{
		return this.userWpJaRestClient.getUserIndex().getUsers();
	}	
}