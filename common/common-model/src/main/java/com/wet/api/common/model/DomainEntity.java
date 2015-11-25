package com.wet.api.common.model;

import java.util.Date;

public interface DomainEntity extends DomainObject
{
	public Date getVersion();
	public void setVersion(Date version);
}