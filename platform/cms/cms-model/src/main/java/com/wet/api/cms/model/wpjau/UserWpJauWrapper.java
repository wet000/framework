package com.wet.api.cms.model.wpjau;

import com.wet.api.cms.model.User;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class UserWpJauWrapper extends AbstractDomainObject
{
	private String status;
	private String cookie;
	private String cookieName;
	private User user;
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public String getCookie() 
	{
		return cookie;
	}
	
	public void setCookie(String cookie) 
	{
		this.cookie = cookie;
	}
	
	public String getCookieName() 
	{
		return cookieName;
	}
	
	public void setCookieName(String cookieName) 
	{
		this.cookieName = cookieName;
	}
	
	public User getUser() 
	{
		return user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
}