package com.wet.api.notification.model;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Subscriber 
{
	public final static boolean ACTIVE = Boolean.TRUE;
	public final static boolean INACTIVE = Boolean.FALSE;
	public final static boolean CONFIRMED = Boolean.TRUE;
	
	private int id;
	private short formId;
	private String email;
	private boolean active;
	private boolean confirmed;
	private DateTime createDate;
	private DateTime activateDate;
	private DateTime deactivateDate;
	private DateTime confirmDate;
	private DateTime lastModified;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public short getFormId()
	{
		return formId;
	}
	
	public void setFormId(short formId)
	{
		this.formId = formId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}

	public boolean isActive() 
	{
		return active;
	}
	
	public void setActive(boolean active) 
	{
		this.active = active;
	}
	
	public boolean isConfirmed()
	{
		return confirmed;
	}
	
	public void setConfirmed(boolean confirmed)
	{
		this.confirmed = confirmed;
	}
	
	public DateTime getCreateDate() 
	{
		return createDate;
	}

	public void setCreateDate(DateTime createDate) 
	{
		this.createDate = createDate;
	}

	public DateTime getActivateDate() 
	{
		return activateDate;
	}

	public void setActivateDate(DateTime activateDate) 
	{
		this.activateDate = activateDate;
	}

	public DateTime getDeactivateDate() 
	{
		return deactivateDate;
	}

	public void setDeactivateDate(DateTime deactivateDate) 
	{
		this.deactivateDate = deactivateDate;
	}

	public DateTime getConfirmDate() 
	{
		return confirmDate;
	}

	public void setConfirmDate(DateTime confirmDate)
	{
		this.confirmDate = confirmDate;
	}

	public DateTime getLastModified() 
	{
		return lastModified;
	}

	public void setLastModified(DateTime lastModified) 
	{
		this.lastModified = lastModified;
	}
	
	/**
	 * Returns a string representation of a {@Subscriber}.
	 * 
	 * @Return		the string representation of a {@Subscriber}
	 */
	@Override
	public String toString()
	{
		DateTimeFormatter formatter = DateTimeFormat.forPattern("MM/dd/yyyy h:mm:ssa");
		StringBuilder sb = new StringBuilder("[");
		
		// Id and Form Id
		sb.append(this.id).append(":").append(formId).append(", ");
		
		// Email
		sb.append("Email:").append(this.email).append(", ");
		
		// Subscribed
		if (this.createDate == null)
		{
			sb.append("Not Subscribed, ");
		}
		else
		{
			sb.append("Subscribed:").append(formatter.print(this.createDate)).append(", ");
		}
		
		// Active
		if (this.isActive())
		{
			sb.append("Active:").append(formatter.print(this.activateDate)).append(", ");
		}
		else
		{
			sb.append("Inactive");
			if (this.deactivateDate == null)
			{
				sb.append(", ");
			}
			else
			{
				sb.append(":").append(formatter.print(this.deactivateDate)).append(", ");
			}
		}
		
		// Confirmed
		if (this.isConfirmed())
		{
			sb.append("Confirmed:").append(formatter.print(this.confirmDate)).append(", ");
		}
		else
		{
			sb.append("Not Confirmed, ");
		}
		
		// Last Modified
		if (this.lastModified == null)
		{
			sb.append("Not Saved");
		}
		else
		{
			sb.append("Last Modified:").append(formatter.print(this.lastModified));
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	/**
	 * Equals method for {@Subscriber}
	 * 
	 * {@Subscriber}s are considered equal if the email addresses are equal
	 * since the email address is the only point of contact to the 
	 * subscriber.
	 * 
	 * @param	o	the term object passed in to determine its equality with this object
	 * @return		true if this term is equal to the term passed in
	 */
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Subscriber) || o == null)
		{
			return false;
		}
		
		Subscriber subscriber = (Subscriber)o;
		if (this.email.equals(subscriber.getEmail()))
		{
			return true;
		}
		
		return false;
	}
	
	/**
	 * Hashcode method for {@Subscriber}
	 * 
	 * The hashcode representation for {@Subscriber}. The email address is used
	 * to determine the hashcode value.
	 * 
	 * @return		the hashcode value
	 */
	@Override
	public int hashCode()
	{
		int hashCode = 31;
		
		hashCode += this.email == null ? 0 : this.email.hashCode();
		
		return hashCode;
	}
}