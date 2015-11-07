package com.wet.api.notification.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wet.api.common.dao.Dao;
import com.wet.api.common.service.impl.AbstractCommonDaoService;
import com.wet.api.notification.dao.SubscriberDao;
import com.wet.api.notification.model.Subscriber;
import com.wet.api.notification.service.SubscriberDaoService;

@Service("subscriberDaoService")
public class SubscriberDaoServiceImpl extends AbstractCommonDaoService<Subscriber> implements SubscriberDaoService 
{
	@Autowired
	@Qualifier("subscriberDaoJpa")
	private SubscriberDao subscriberDao;

	@Override
	protected Dao<Subscriber> getDao() 
	{
		return subscriberDao;
	}
}