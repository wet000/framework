package com.wet.api.cms.service;

import java.util.List;

import com.wet.api.cms.model.User;
import com.wet.api.common.service.CommonRestService;

public interface UserService extends CommonRestService
{
	public void register(User user);
	public void save(User user);
	public User login(String username, String password);
	public User getAuthenticatedUser();
	//public User findUserById(long id); // Could use get_userinfo unless the user requested is logged in
	public List<User> findAllUsersWithPublishedPosts();
}