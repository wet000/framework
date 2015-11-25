package com.wet.api.common.model.impl;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

import com.wet.api.common.model.DomainEntity;

public abstract class AbstractDomainEntity extends AbstractDomainObject implements DomainEntity, Serializable
{
	private static final long serialVersionUID = -9084097960264172171L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected long id;
	
	@Version
	protected Date version;
	
	@Override
	public Date getVersion() 
	{
		return version;
	}

	@Override
	public void setVersion(Date version) 
	{
		this.version = version;
	}
}