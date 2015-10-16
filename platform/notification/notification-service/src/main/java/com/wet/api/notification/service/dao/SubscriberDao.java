package com.wet.api.notification.service.dao;

import com.wet.api.notification.model.Subscriber;

public interface SubscriberDao 
{
	  public static final String TABLE_NAME = "subscriber";

	  /**
	   * Retrieve a {@link Subscriber} by id.
	   *
	   * @param 	id Id of the {@link Subscriber} to retrieve
	   * @return 	The found {@link Subscriber}
	   */
	  //public Subscriber retrieve(int id);

	  /**
	   * Retrieve all the latest unique {@link Subscriber}
	   *
	   * @return 	A list of {@link Subscriber}
	   */
	  //public List<Subscriber> retrieveAll();

	  /**
	   * Update or create a {@link Subscriber}.
	   *
	   * @param 	subscriber The {@link Subscriber} to create or update
	   * @return	True if the {@link Subscriber} was successfully saved.
	   */
	  public boolean save(Subscriber subscriber);
}