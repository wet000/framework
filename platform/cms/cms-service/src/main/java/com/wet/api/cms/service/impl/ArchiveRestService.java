package com.wet.api.cms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.Archive;
import com.wet.api.cms.model.wpja.ArchiveWpJaWrapper;
import com.wet.api.cms.rest.wpja.ArchiveWpJaRestClient;
import com.wet.api.cms.service.ArchiveService;

@Service("archiveRestService")
public class ArchiveRestService implements ArchiveService
{
	@Autowired
	private ArchiveWpJaRestClient<ArchiveWpJaWrapper> archiveWpJaRestClient;
	
	@Override
	public Archive getArchive()
	{
		return this.archiveWpJaRestClient.getDateIndex().getArchive();
	}
}