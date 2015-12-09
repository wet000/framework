package com.wet.api.cms.model.wpja;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wet.api.cms.model.ArchiveMonth;
import com.wet.api.cms.model.ArchiveMonth.MONTH;

public class ArchiveMonthsWpJa
{
	@JsonProperty("01")
	private short januaryCount;
	
	@JsonProperty("02")
	private short februaryCount;
	
	@JsonProperty("03")
	private short marchCount;
	
	@JsonProperty("04")
	private short aprilCount;
	
	@JsonProperty("05")
	private short mayCount;
	
	@JsonProperty("06")
	private short juneCount;
	
	@JsonProperty("07")
	private short julyCount;
	
	@JsonProperty("08")
	private short augustCount;
	
	@JsonProperty("09")
	private short septemberCount;
	
	@JsonProperty("10")
	private short octoberCount;
	
	@JsonProperty("11")
	private short novemberCount;
	
	@JsonProperty("12")
	private short decemberCount;
	
	public List<ArchiveMonth> getArchiveMonths(List<String> permalinks, int permalinkStartIndex)
	{
		List<ArchiveMonth> archiveMonths = new ArrayList<ArchiveMonth>();
		
		if (this.januaryCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.JANUARY);
			archiveMonth.setCount(this.januaryCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.februaryCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.FEBRUARY);
			archiveMonth.setCount(this.februaryCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.marchCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.MARCH);
			archiveMonth.setCount(this.marchCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.aprilCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.APRIL);
			archiveMonth.setCount(this.aprilCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.mayCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.MAY);
			archiveMonth.setCount(this.mayCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.juneCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.JUNE);
			archiveMonth.setCount(this.juneCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.julyCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.JULY);
			archiveMonth.setCount(this.julyCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.augustCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.AUGUST);
			archiveMonth.setCount(this.augustCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.septemberCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.SEPTEMBER);
			archiveMonth.setCount(this.septemberCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.octoberCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.OCTOBER);
			archiveMonth.setCount(this.octoberCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.novemberCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.NOVEMBER);
			archiveMonth.setCount(this.novemberCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		if (this.decemberCount > 0)
		{
			ArchiveMonth archiveMonth = new ArchiveMonth();
			archiveMonth.setMonth(MONTH.DECMEBER);
			archiveMonth.setCount(this.decemberCount);
			archiveMonth.setPermalink(permalinks.get(permalinkStartIndex++));
			archiveMonths.add(archiveMonth);
		}
		
		return archiveMonths;
	}

	public short getJanuaryCount() 
	{
		return januaryCount;
	}

	public void setJanuaryCount(short januaryCount) 
	{
		this.januaryCount = januaryCount;
	}

	public short getFebruaryCount() 
	{
		return februaryCount;
	}

	public void setFebruaryCount(short februaryCount)
	{
		this.februaryCount = februaryCount;
	}

	public short getMarchCount() 
	{
		return marchCount;
	}

	public void setMarchCount(short marchCount) 
	{
		this.marchCount = marchCount;
	}

	public short getAprilCount()
	{
		return aprilCount;
	}

	public void setAprilCount(short aprilCount)
	{
		this.aprilCount = aprilCount;
	}

	public short getMayCount() 
	{
		return mayCount;
	}

	public void setMayCount(short mayCount) 
	{
		this.mayCount = mayCount;
	}

	public short getJuneCount() 
	{
		return juneCount;
	}

	public void setJuneCount(short juneCount)
	{
		this.juneCount = juneCount;
	}

	public short getJulyCount() 
	{
		return julyCount;
	}

	public void setJulyCount(short julyCount)
	{
		this.julyCount = julyCount;
	}

	public short getAugustCount()
	{
		return augustCount;
	}

	public void setAugustCount(short augustCount)
	{
		this.augustCount = augustCount;
	}

	public short getSeptemberCount() 
	{
		return septemberCount;
	}

	public void setSeptemberCount(short septemberCount) 
	{
		this.septemberCount = septemberCount;
	}

	public short getOctoberCount()
	{
		return octoberCount;
	}

	public void setOctoberCount(short octoberCount) 
	{
		this.octoberCount = octoberCount;
	}

	public short getNovemberCount() 
	{
		return novemberCount;
	}

	public void setNovemberCount(short novemberCount) 
	{
		this.novemberCount = novemberCount;
	}

	public short getDecemberCount() 
	{
		return decemberCount;
	}

	public void setDecemberCount(short decemberCount) 
	{
		this.decemberCount = decemberCount;
	}	
}