package com.wet.api.cms.rest.wpja.impl;

import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpja.ArchiveWpJaWrapper;
import com.wet.api.cms.rest.wpja.ArchiveWpJaRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("archiveWpJaRestClientImpl")
public class ArchiveWpJaRestClientImpl extends AbstractSpringRestClient<ArchiveWpJaWrapper> implements ArchiveWpJaRestClient<ArchiveWpJaWrapper> 
{
	private static final String METHOD_GET_DATE_INDEX = "get_date_index";
	
	public ArchiveWpJaRestClientImpl() 
	{
		super(ArchiveWpJaWrapper.class);
	}

	@Override
	public ArchiveWpJaWrapper getDateIndex() 
	{
		setMethod(METHOD_GET_DATE_INDEX);
		return get();
	}
}