package com.wet.api.notification.service;

import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.util.reflection.Whitebox;
import org.mockito.runners.MockitoJUnitRunner;

import com.wet.api.notification.dao.SubscriberDao;
import com.wet.api.notification.model.Subscriber;
import com.wet.api.notification.service.impl.SubscriberDaoServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class SubscriberDaoServiceImplTest 
{
	private SubscriberDaoServiceImpl subscriberDaoService;
	
	@Mock
	private SubscriberDao mockSubscriberDao;
	
	@Before
	public void setup()
	{
		subscriberDaoService = new SubscriberDaoServiceImpl();
		Whitebox.setInternalState(subscriberDaoService, "subscriberDao", mockSubscriberDao);
	}
	
	@Test
	public void testFindById()
	{
		long id = 1;
		Subscriber expected = new Subscriber();
		
		when(mockSubscriberDao.find(id)).thenReturn(expected);
		Subscriber found = subscriberDaoService.find(id);
		
		assertThat(found, sameInstance(expected));
	}
	
	@Test
	public void testSave()
	{
		Subscriber subscriber = new Subscriber();
		subscriber.setFormId((short)1);
		subscriber.setEmail("test@email.com");
		subscriber.setActive(Subscriber.ACTIVE);
		subscriber.setConfirmed(Subscriber.CONFIRMED);
		
		doNothing().when(mockSubscriberDao).save(subscriber);	
		subscriberDaoService.save(subscriber);
		
		verify(mockSubscriberDao).save(subscriber);
	}
}