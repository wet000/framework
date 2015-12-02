package com.wet.api.cms.model;

import java.util.List;

import com.wet.api.common.model.impl.AbstractDomainObject;

public class Archive extends AbstractDomainObject
{
	private List<ArchiveYear> archiveYears;

	public List<ArchiveYear> getArchiveYears()
	{
		return archiveYears;
	}

	public void setArchiveYears(List<ArchiveYear> archiveYears)
	{
		this.archiveYears = archiveYears;
	}
}