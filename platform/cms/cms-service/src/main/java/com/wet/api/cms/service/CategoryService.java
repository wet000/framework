package com.wet.api.cms.service;

import java.util.List;

import com.wet.api.cms.model.Category;
import com.wet.api.common.service.CommonRestService;

public interface CategoryService extends CommonRestService
{
	public List<Category> findAllCategories();
	public List<Category> findAllSubCategories(int parentId);
}