package com.wet.api.notification.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.NotImplementedException;
import org.joda.time.DateTime;

import com.wet.api.notification.model.Subscriber;
import com.wet.api.notification.model.SubscriberSearch;
import com.wet.api.notification.service.api.SubscriberService;
import com.wet.api.notification.service.dao.SubscriberDao;

@Named
public class SubscriberServiceImpl implements SubscriberService 
{
	private final static String NOT_IMPLEMENTED_MESSAGE = "This method is currently not implemented";
	
	@Inject
	SubscriberDao subscriberDao;

	@Override
	public Subscriber find(int id) 
	{
		throw new NotImplementedException(NOT_IMPLEMENTED_MESSAGE);
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
	public boolean save(Subscriber subscriber) 
	{
		subscriber.setLastModified(getCurrentTime());
		System.out.println("I'm going to save now");
		return subscriberDao.save(subscriber);
	}

	@Override
	public void delete(int id) 
	{
		throw new NotImplementedException(NOT_IMPLEMENTED_MESSAGE);	
	}

	@Override
	public void subscribe(Subscriber subscriber) 
	{
		subscriber.setCreateDate(getCurrentTime());	
	}

	@Override
	public void activate(Subscriber subscriber) 
	{
		subscriber.setActive(Subscriber.ACTIVE);
		subscriber.setActivateDate(getCurrentTime());
	}

	@Override
	public void deactivate(Subscriber subscriber) 
	{
		subscriber.setActive(Subscriber.INACTIVE);
		subscriber.setDeactivateDate(getCurrentTime());
	}

	@Override
	public void confirm(Subscriber subscriber) {
		subscriber.setConfirmed(Subscriber.CONFIRMED);
		subscriber.setConfirmDate(getCurrentTime());
	}
	
	private DateTime getCurrentTime()
	{
		return new DateTime();
	}
}