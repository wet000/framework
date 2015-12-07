package com.wet.api.cms.service;

import com.wet.api.cms.model.Archive;
import com.wet.api.common.service.CommonRestService;

public interface ArchiveService extends CommonRestService
{
	public Archive getArchive();
}