package com.wet.api.notification.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.NotImplementedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.wet.api.common.dao.Dao;
import com.wet.api.common.service.impl.AbstractCommonDaoService;
import com.wet.api.notification.dao.SubscriberDao;
import com.wet.api.notification.model.Subscriber;
import com.wet.api.notification.model.SubscriberSearch;
import com.wet.api.notification.service.SubscriberDaoService;

@Service("subscriberDaoService")
public class SubscriberDaoServiceImpl extends AbstractCommonDaoService<Subscriber> implements SubscriberDaoService 
{
	private final static String NOT_IMPLEMENTED_MESSAGE = "This method is currently not implemented";
	
	@Autowired
	@Qualifier("subscriberDaoJpa")
	private SubscriberDao subscriberDao;

	@Override
	protected Dao<Subscriber> getDao() 
	{
		return subscriberDao;
	}
	
	@Override
	public Subscriber find(String email) 
	{
		throw new NotImplementedException(NOT_IMPLEMENTED_MESSAGE);
	}

	@Override
	public List<Subscriber> find(SubscriberSearch search)
	{
		throw new NotImplementedException(NOT_IMPLEMENTED_MESSAGE);
	}

	@Override
	public void save(Subscriber subscriber) 
	{
		super.save(subscriber);
	}

	@Override
	public void subscribe(Subscriber subscriber) 
	{
		activate(subscriber);
		subscriber.setCreateDate(new Date());
	}

	@Override
	public void deactivate(Subscriber subscriber) 
	{
		subscriber.setActive(Subscriber.INACTIVE);
		subscriber.setDeactivateDate(new Date());
	}

	@Override
	public void confirm(Subscriber subscriber) {
		subscriber.setConfirmed(Subscriber.CONFIRMED);
		subscriber.setConfirmDate(new Date());
	}
	
	private void activate(Subscriber subscriber) 
	{
		subscriber.setActive(Subscriber.ACTIVE);
		subscriber.setActivateDate(new Date());
	}
}