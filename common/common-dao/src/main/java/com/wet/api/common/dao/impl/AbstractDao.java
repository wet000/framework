package com.wet.api.common.dao.impl;

import com.wet.api.common.dao.Dao;
import com.wet.api.common.model.DomainObject;

public abstract class AbstractDao<T extends DomainObject> implements Dao<T> 
{
	protected final Class<T> type;
	
	public AbstractDao(Class<T> type)
	{
		this.type = type;
	}
}