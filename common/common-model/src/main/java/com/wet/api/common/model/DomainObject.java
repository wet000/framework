package com.wet.api.common.model;

import java.io.Serializable;

public interface DomainObject extends Serializable
{
	public long getId();
	public void setId(long id);
}