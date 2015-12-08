package com.wet.api.cms.rest.wpjau.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.User;
import com.wet.api.cms.model.wpjau.UserWpJauWrapper;
import com.wet.api.cms.rest.wpjau.NonceWpJauRestClient;
import com.wet.api.cms.rest.wpjau.UserWpJauRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("userWpJauRestClientImpl")
public class UserWpJauRestClientImpl extends AbstractSpringRestClient<UserWpJauWrapper> implements UserWpJauRestClient<UserWpJauWrapper>
{
	private static final String METHOD_REGISTER 				= "register";
	private static final String METHOD_UPDATE_USER_META_VARS 	= "update_user_meta_vars";
	private static final String METHOD_GENERATE_AUTH_COOKIE 	= "generate_auth_cookie";
	
	private static final String PARAM_USERNAME					= "username";
	private static final String PARAM_PASSWORD					= "password";
	private static final String PARAM_EMAIL						= "email";
	private static final String PARAM_NONCE						= "nonce";
	private static final String PARAM_DISPLAY_NAME 				= "display_name";
	private static final String PARAM_USER_PASS					= "user_pass";
	private static final String PARAM_FIRST_NAME				= "first_name";
	private static final String PARAM_LAST_NAME					= "last_name";
	private static final String PARAM_COOKIE					= "cookie";
	
	
	private String baseUri = System.getenv("OPENSHIFT_WP_BASEURL") + "/api/user/";
	
	@Autowired
	private NonceWpJauRestClient nonceWpJauRestClientImpl;
	
	private UserWpJauWrapper userWpJauWrapper;
	
	public UserWpJauRestClientImpl() 
	{
		super(UserWpJauWrapper.class);
	}

	@Override
	public String getBaseUri() 
	{
		return baseUri;
	}
	
	@Override
	public void register(User user)
	{
		// Optional fields: 'user_pass', 'user_nicename', 'user_url', 'nickname', 'first_name', 'last_name', 'description', 'rich_editing', 'user_registered', 'jabber', 'aim', 'yim', 'comment_shortcuts', 'admin_color', 'use_ssl', 'show_admin_bar_front'.
		setMethod(METHOD_REGISTER);
		putParam(PARAM_USERNAME, user.getUsername());
		putParam(PARAM_EMAIL, user.getEmail());
		putParam(PARAM_NONCE, nonceWpJauRestClientImpl.getRegistrationNonce().getNonce()); // TODO: May want to cache the nonce
		putParam(PARAM_DISPLAY_NAME, user.getDisplayName());
		putParam(PARAM_USER_PASS, user.getPassword());
		putParam(PARAM_FIRST_NAME, user.getFirstName());
		putParam(PARAM_LAST_NAME, user.getLastName());
		
		System.out.println("Nonce: " + nonceWpJauRestClientImpl.getRegistrationNonce().getNonce());
		System.out.println("Nonce: " + nonceWpJauRestClientImpl.getRegistrationNonce().getNonce());
		
		
		get();
	}

	@Override
	public void save(User user) 
	{
		//cookie=myquest97|1450527236|PNA3U9VZsTu9K4zaUt3098ONp3HSyvzZSCWlyiQKuLy|475242f1060a369b498d0592081fef7e2a7d2883d387e5d60881253ccbd096d0&
		//meta_key=display_name&
		//meta_value=Bob
		
		
//		
//		if (userWpJauWrapper == null)
//		{
//			//throw new customruntimeexception
//		}
//			
//		// TODO: If user hasn't logged in yet, the UserWpJauWrapper 
//		// will be null and a custom exception should be thrown
//		// Maybe we should validate the cookie as well here first
//		setMethod(METHOD_UPDATE_USER_META_VARS);
//		putParam(PARAM_COOKIE, userWpJauWrapper.getCookie()); 	
//		putParam(PARAM_NICENAME, user.getSlug());
//		
//		cookie=COOKIE-HERE&website=user-website.com&city=Chicago&country=USA&skills=php,css,js,web design
//				
//				private String password;
//				@JsonProperty("nicename")
//				private String slug; 
//				private String nickname;
//				@JsonProperty("first_name")
//				private String firstName;
//				@JsonProperty("last_name")
//				private String lastName;
//				@JsonProperty("name")
//				private String displayName;
//				private String email;
//				@JsonProperty("url")
//				private String website;
//				@JsonProperty("description")
//				private String bio;
//				
//	
	}

	@Override
	public void authenticateUser(String username, String password) 
	{
		// First need to send a request for the authentication nonce
		nonceWpJauRestClientImpl.getAuthenticationNonce();
		setMethod(METHOD_GENERATE_AUTH_COOKIE);
		putParam(PARAM_USERNAME, username);
		putParam(PARAM_PASSWORD, password);
		
		// Cache userWpJauWrapper so we can get the cookie when saving 
		userWpJauWrapper = get();
	}

	@Override
	public UserWpJauWrapper getUser() 
	{
		if (userWpJauWrapper == null)
		{
			// Throw a custom exception here - maybe even a checked one since it can be dealt with in the service layer (ie authenticateUser should be run)
			// Should we do a validate check here too to see if the cookie is current? Probably not since it requires a request every time we want to get the user
		}
		return userWpJauWrapper;
	}	
}