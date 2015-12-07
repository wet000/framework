package com.wet.api.cms.service;

import java.util.List;

import com.wet.api.cms.model.Tag;
import com.wet.api.common.service.CommonRestService;

public interface TagService extends CommonRestService
{
	public List<Tag> findAllTags();
}