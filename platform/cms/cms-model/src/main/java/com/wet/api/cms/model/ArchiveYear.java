package com.wet.api.cms.model;

import java.util.List;

import com.wet.api.common.model.impl.AbstractDomainObject;

public class ArchiveYear extends AbstractDomainObject
{
	private int year;
	private List<ArchiveMonth> archiveMonths;

	public int getYear()
	{
		return year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}

	public List<ArchiveMonth> getArchiveMonths()
	{
		return archiveMonths;
	}

	public void setArchiveMonths(List<ArchiveMonth> archiveMonths) 
	{
		this.archiveMonths = archiveMonths;
	}
}