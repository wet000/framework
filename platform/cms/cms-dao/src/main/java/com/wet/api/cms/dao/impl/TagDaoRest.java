package com.wet.api.cms.dao.impl;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Repository;

import com.wet.api.cms.dao.TagDao;
import com.wet.api.cms.model.Tag;
import com.wet.api.common.dao.impl.AbstractDaoRest;

@Repository("tagDaoRest")
public class TagDaoRest extends AbstractDaoRest<Tag> implements TagDao
{
	private final static String NOT_IMPLEMENTED_MESSAGE = "This method is currently not implemented";
	
	public TagDaoRest()
	{
		super(Tag.class);
	}

	@Override
	public Tag find(long id)
	{
		return null;
	}

	@Override
	public void save(Tag object) 
	{
		throw new NotImplementedException(NOT_IMPLEMENTED_MESSAGE);
	}

	@Override
	public void delete(Tag object) 
	{
		throw new NotImplementedException(NOT_IMPLEMENTED_MESSAGE);
	}
}