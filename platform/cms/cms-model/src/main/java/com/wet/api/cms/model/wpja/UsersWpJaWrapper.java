package com.wet.api.cms.model.wpja;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wet.api.cms.model.User;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class UsersWpJaWrapper extends AbstractDomainObject
{
	private String status;
	
	private int count;
	
	@JsonProperty("authors")
	private List<User> users;
	
	public String getStatus()
	{
		return status;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public int getCount() 
	{
		return count;
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}

	public List<User> getUsers() 
	{
		return users;
	}

	public void setUsers(List<User> users) 
	{
		this.users = users;
	}
}