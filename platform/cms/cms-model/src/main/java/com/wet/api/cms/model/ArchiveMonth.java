package com.wet.api.cms.model;

import com.wet.api.common.model.impl.AbstractDomainObject;

public class ArchiveMonth extends AbstractDomainObject
{
	public enum MONTH
	{
		UNDEFINED,
		JANUARY,
		FEBRUARY,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST,
		SEPTEMBER,
		OCTOBER,
		NOVEMBER,
		DECMEBER
	}
	
	private MONTH month;
	private int count;
	private String permalink;
	
	public MONTH getMonth() 
	{
		return month;
	}

	public void setMonth(MONTH month) 
	{
		this.month = month;
	}

	public int getCount()
	{
		return count;
	}
	
	public void setCount(int count) 
	{
		this.count = count;
	}
	
	public String getPermalink() 
	{
		return permalink;
	}
	
	public void setPermalink(String permalink) 
	{
		this.permalink = permalink;
	}
	
	@Override
	public String toString()
	{
		return this.month.toString() + " (" + this.count + ")" + " " + this.permalink;
	}
}