package com.wet.api.cms.dao.impl;

import java.util.List;

import com.wet.api.cms.dao.AttachmentDao;
import com.wet.api.cms.model.Attachment;
import com.wet.api.common.dao.impl.AbstractDaoRest;

public class AttachmentDaoRest extends AbstractDaoRest<Attachment> implements AttachmentDao 
{
	public AttachmentDaoRest() 
	{
		super(Attachment.class);
	}

	@Override
	public Attachment find(long id)
	{
		return null;
	}

	@Override
	public List<Attachment> findAll() 
	{
		return null;
	}

	@Override
	public void save(Attachment object) 
	{
		
	}

	@Override
	public void delete(Attachment object) 
	{
		
	}
}