package com.wet.api.cms.model.wpjau;

import com.wet.api.common.model.impl.AbstractDomainObject;

public class NonceWpJauWrapper extends AbstractDomainObject
{
	private String status;
	private String controller;
	private String method;
	private String nonce;
	
	public String getStatus() 
	{
		return status;
	}
	
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	public String getController() 
	{
		return controller;
	}
	
	public void setController(String controller) 
	{
		this.controller = controller;
	}
	
	public String getMethod() 
	{
		return method;
	}
	
	public void setMethod(String method)
	{
		this.method = method;
	}
	
	public String getNonce()
	{
		return nonce;
	}
	
	public void setNonce(String nonce) 
	{
		this.nonce = nonce;
	}
}