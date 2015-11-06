package com.wet.api.notification.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class SubscriberDaoJpaTest extends SubscriberDaoTest
{
	@Autowired
	@Qualifier("subscriberDaoJpa")
	private SubscriberDao subscriberDaoJpa;

	@Override
	protected SubscriberDao getSubscriberDao() 
	{
		return subscriberDaoJpa;
	}
}