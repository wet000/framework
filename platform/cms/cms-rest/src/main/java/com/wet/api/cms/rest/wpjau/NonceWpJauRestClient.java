package com.wet.api.cms.rest.wpjau;

import com.wet.api.cms.model.wpjau.NonceWpJauWrapper;
import com.wet.api.common.model.DomainObject;

public interface NonceWpJauRestClient<T extends DomainObject>
{
	public NonceWpJauWrapper getRegistrationNonce();
	public NonceWpJauWrapper getAuthenticationNonce();
}