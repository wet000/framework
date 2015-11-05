package com.wet.api.notification.service;

import java.util.List;

import com.wet.api.common.service.CommonDaoService;
import com.wet.api.notification.model.Subscriber;
import com.wet.api.notification.model.SubscriberSearch;

public interface SubscriberDaoService extends CommonDaoService<Subscriber> 
{	
	/**
	 * Find a specific {@link Subscriber}.
	 * 
	 * @param 	email 	The email of the {@link Subscriber} to search for
	 * @return 			The found {@link Subscriber} (or null)
	 */
	public Subscriber find(String email);

	/**
	 * Find all {@link Subscriber}s based on the given {@link SubscriberSearch}.
	 *
	 * @param 	search 	The search criteria used to search for {@link Subscriber}s
	 * @return			A {@link List} of {@link Subscriber}
	 */
	public List<Subscriber> find(SubscriberSearch search);
	
	/**
	 * Subscribes a {@link Subscriber}
	 *
	 * @param 	subscriber	The {@link Subscriber} to subscribe
	 */
	public void subscribe(Subscriber subscriber);
	
	/**
	 * Deactivates a {@link Subscriber}
	 *
	 * @param 	subscriber	The {@link Subscriber} to deactivate
	 */
	public void deactivate(Subscriber subscriber);
	
	/**
	 * Confirms a {@link Subscriber}
	 *
	 * @param 	subscriber	The {@link Subscriber} to confirm
	 */
	public void confirm(Subscriber subscriber);
}