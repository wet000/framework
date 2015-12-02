package com.wet.api.cms.model.wpja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wet.api.cms.model.Archive;
import com.wet.api.cms.model.ArchiveMonth;
import com.wet.api.cms.model.ArchiveYear;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class ArchiveWpJaWrapper extends AbstractDomainObject
{
	private String status;
	
	private List<String> permalinks;
	
	@JsonProperty("tree")
	private ArchiveYearsWpJa archiveYearsWpJa;
	
	public Archive getArchive()
	{
		Archive archive = new Archive();
		List<ArchiveYear> archiveYears = new ArrayList<ArchiveYear>();
		ArchiveYear archiveYear;
		int permalinkStartIndex = 0;
		Collections.reverse(permalinks);
		
		if (archiveYearsWpJa.getYear2012() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2012);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2012().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}

		if (archiveYearsWpJa.getYear2013() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2013);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2013().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		if (archiveYearsWpJa.getYear2014() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2014);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2014().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		if (archiveYearsWpJa.getYear2015() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2015);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2015().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		if (archiveYearsWpJa.getYear2016() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2016);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2016().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		if (archiveYearsWpJa.getYear2017() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2017);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2017().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		if (archiveYearsWpJa.getYear2018() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2018);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2018().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		if (archiveYearsWpJa.getYear2019() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2019);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2019().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		if (archiveYearsWpJa.getYear2020() != null)
		{
			archiveYear = new ArchiveYear();
			archiveYear.setYear(2020);
			
			List<ArchiveMonth> archiveMonths = archiveYearsWpJa.getYear2020().getArchiveMonths(permalinks, permalinkStartIndex);
			archiveYear.setArchiveMonths(archiveMonths);
			archiveYears.add(archiveYear);
			
			permalinkStartIndex+=archiveMonths.size();
		}
		
		archive.setArchiveYears(archiveYears);
		return archive;
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

	public List<String> getPermalinks() 
	{
		return permalinks;
	}

	public void setPermalinks(List<String> permalinks) 
	{
		this.permalinks = permalinks;
	}

	public ArchiveYearsWpJa getWpJaArchiveYears()
	{
		return archiveYearsWpJa;
	}

	public void setWpJaArchiveYears(ArchiveYearsWpJa archiveYearsWpJa) 
	{
		this.archiveYearsWpJa = archiveYearsWpJa;
	}
}