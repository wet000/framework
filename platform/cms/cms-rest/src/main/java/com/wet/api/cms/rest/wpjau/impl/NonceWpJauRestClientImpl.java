package com.wet.api.cms.rest.wpjau.impl;

import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpjau.NonceWpJauWrapper;
import com.wet.api.cms.rest.wpjau.NonceWpJauRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("nonceWpJauRestClientImpl")
public class NonceWpJauRestClientImpl extends AbstractSpringRestClient<NonceWpJauWrapper> implements NonceWpJauRestClient<NonceWpJauWrapper>
{
	private static final String METHOD_GET_NONCE = "get_nonce";
	
	private static final String PARAM_CONTROLLER = "controller";
	private static final String PARAM_METHOD = "method";
	
	private static final String VALUE_USER_CONTROLLER = "user";
	private static final String VALUE_REGISTER_METHOD = "register";
	private static final String VALUE_GENERATE_AUTH_COOKIE_METHOD = "generate_auth_cookie";
	
	private String baseUri = System.getenv("OPENSHIFT_WP_BASEURL") + "/api/";
	
	public NonceWpJauRestClientImpl() 
	{
		super(NonceWpJauWrapper.class);
	}

	@Override
	public String getBaseUri() 
	{
		return baseUri;
	}

	@Override
	public NonceWpJauWrapper getRegistrationNonce() 
	{
		setMethod(METHOD_GET_NONCE);
		putParam(PARAM_CONTROLLER, VALUE_USER_CONTROLLER);
		putParam(PARAM_METHOD, VALUE_REGISTER_METHOD);
		return get();
	}
	
	@Override
	public NonceWpJauWrapper getAuthenticationNonce() 
	{
		setMethod(METHOD_GET_NONCE);
		putParam(PARAM_CONTROLLER, VALUE_USER_CONTROLLER);
		putParam(PARAM_METHOD, VALUE_GENERATE_AUTH_COOKIE_METHOD);
		return get();
	}
}