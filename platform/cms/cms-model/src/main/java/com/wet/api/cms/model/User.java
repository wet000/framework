package com.wet.api.cms.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.wet.api.common.model.impl.AbstractDomainObject;

@JsonIgnoreProperties(ignoreUnknown=true)
public class User extends AbstractDomainObject
{
	// TODO:
	//	1. Need to make slug, firstname, lastname compatible across both JSON API and JSON API User
	//	2. Need to find a way to map the register date when retrieving the user
	//	3. Need to decide how to map the user ROLEs
	
	public enum ROLE
	{
		UNDEFINED,
		SUBSCRIBER,
		CONTRIBUTOR,
		AUTHOR,
		EDITOR,
		ADMINISTRATOR
	}
	
	private String username;
	
	private String password;

	@JsonProperty("nicename")
	private String slug; // Username made URL compliant also known as nicename
	
	private String nickname;
	
	@JsonProperty("first_name")
	private String firstName;
	
	@JsonProperty("last_name")
	private String lastName;
	
	@JsonProperty("name")
	private String displayName;
	
	// TODO: In JSON API User, there is a capabilities object that gives the actual role.
	// You'll need to either extract that from another object or something here
	private ROLE role;
	
	private String email;
	
	@JsonProperty("url")
	private String website;
	
	// TODO: Should this be moved to a subclass specifically for authors, maybe providers and clients too?
	@JsonProperty("description")
	private String bio;
	
	// TODO: The JSON API User Rest interface lets you get their avatar as well.
	// You'll need to research deeper into exactly what this is
	
//	@JsonIgnore
//	@JsonProperty("registered")
//	private Date createDate;

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getSlug() 
	{
		return slug;
	}

	public void setSlug(String slug)
	{
		this.slug = slug;
	}
	
	// TODO: See http://stackoverflow.com/questions/19564711/json-jackson-parse-different-keys-into-same-field
//	@JsonProperty("nicename")
//	private String getNicename()
//	{
//		return slug;
//	}
//	
//	@JsonProperty("nicename")
//	private void setNicename(String slug)
//	{
//		this.slug = slug;
//	}

	public String getNickname()
	{
		return nickname;
	}

	public void setNickname(String nickname) 
	{
		this.nickname = nickname;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getDisplayName()
	{
		return displayName;
	}

	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
	}

	public ROLE getRole()
	{
		return role;
	}

	public void setRole(ROLE role)
	{
		this.role = role;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getWebsite()
	{
		return website;
	}

	public void setWebsite(String website)
	{
		this.website = website;
	}

	public String getBio()
	{
		return bio;
	}

	public void setBio(String bio) 
	{
		this.bio = bio;
	}

//	public Date getCreateDate()
//	{
//		return createDate;
//	}
//
//	public void setCreateDate(Date createDate)
//	{
//		this.createDate = createDate;
//	}
}