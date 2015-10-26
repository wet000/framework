package com.wet.api.notification.service.api;

import java.util.List;

import com.wet.api.notification.model.Subscriber;
import com.wet.api.notification.model.SubscriberSearch;

public interface SubscriberService 
{
	/**
	 * Find a specific {@link Subscriber}.
	 * 
	 * @param 	id	The id of the {@link Subscriber} to search for
	 * @return 		The found {@link Subscriber} (or null)
	 */
	public Subscriber find(int id);
	
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
	 * Saves a {@link Subscriber} to persistent storage by either creating or
	 * updating a database record.
	 *
	 * @param 	subscriber 	The {@link Subscriber} to save
	 * @return 				The saved {@link Subscriber} with the generated id
	 */
	public boolean save(Subscriber subscriber);

	/**
	 * Delete a {@link Subscriber}
	 *
	 * @param 	id 	The id of the {@link Subscriber} to delete
	 */
	public void delete(int id);
	
	/**
	 * Subscribes a {@link Subscriber}
	 *
	 * @param 	subscriber	The {@link Subscriber} to subscribe
	 */
	public void subscribe(Subscriber subscriber);
	
	/**
	 * Activates a {@link Subscriber}
	 *
	 * @param 	subscriber	The {@link Subscriber} to activate
	 */
	public void activate(Subscriber subscriber);
	
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