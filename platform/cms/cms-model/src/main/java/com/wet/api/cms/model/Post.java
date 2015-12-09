package com.wet.api.cms.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wet.api.common.model.impl.AbstractDomainObject;

public class Post extends AbstractDomainObject 
{
	private String type; // post or page
	private String slug;
	private String url;
	private String title;
	private String titlePlain;
	private String content; // modified by the read_more argument
	private String excerpt;
	private String date; // modified by the date_format argument
	private String modified; // modified by the date_format_argum
	private List<Category> categories;
	private List<Tag> tags;
	
	@JsonProperty("author")
	private User user;
	private List<Comment> comments;
	private List<Attachment> attachments;
	private int commentCount;
	private String commentStatus; // open or closed
	private String thumbnail; // only included if a post thumbnail has been specified
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public String getSlug() 
	{
		return slug;
	}
	
	public void setSlug(String slug) 
	{
		this.slug = slug;
	}
	
	public String getUrl() 
	{
		return url;
	}
	
	public void setUrl(String url) 
	{
		this.url = url;
	}
	
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getTitlePlain()
	{
		return titlePlain;
	}
	
	public void setTitlePlain(String titlePlain)
	{
		this.titlePlain = titlePlain;
	}
	
	public String getContent() 
	{
		return content;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public String getExcerpt()
	{
		return excerpt;
	}
	
	public void setExcerpt(String excerpt)
	{
		this.excerpt = excerpt;
	}
	
	public String getDate() 
	{
		return date;
	}
	
	public void setDate(String date) 
	{
		this.date = date;
	}
	
	public String getModified() 
	{
		return modified;
	}
	
	public void setModified(String modified) 
	{
		this.modified = modified;
	}
	
	public List<Category> getCategories() 
	{
		return categories;
	}
	
	public void setCategories(List<Category> categories) 
	{
		this.categories = categories;
	}
	
	public List<Tag> getTags() 
	{
		return tags;
	}
	
	public void setTags(List<Tag> tags) 
	{
		this.tags = tags;
	}
	
	public User getUser()
	{
		return user;
	}
	
	public void setUser(User user) 
	{
		this.user = user;
	}
	
	public List<Comment> getComments()
	{
		return comments;
	}
	
	public void setComments(List<Comment> comments) 
	{
		this.comments = comments;
	}
	
	public List<Attachment> getAttachments()
	{
		return attachments;
	}
	
	public void setAttachments(List<Attachment> attachments) 
	{
		this.attachments = attachments;
	}
	
	public int getCommentCount() 
	{
		return commentCount;
	}
	
	public void setCommentCount(int commentCount) 
	{
		this.commentCount = commentCount;
	}
	
	public String getCommentStatus() 
	{
		return commentStatus;
	}
	
	public void setCommentStatus(String commentStatus)
	{
		this.commentStatus = commentStatus;
	}
	
	public String getThumbnail() 
	{
		return thumbnail;
	}
	
	public void setThumbnail(String thumbnail) 
	{
		this.thumbnail = thumbnail;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.type).append(",");
		sb.append(this.slug).append(",");
		sb.append(this.url).append(",");
		sb.append(this.title).append(",");
		sb.append(this.titlePlain).append(",");
		sb.append(this.content).append(",");
		sb.append(this.content).append(",");
		sb.append(this.date).append(",");
		sb.append(this.modified).append(",");
		sb.append(this.categories).append(",");
		sb.append(this.tags).append(",");
		sb.append(this.user).append(",");
		sb.append(this.comments).append(",");
		sb.append(this.attachments).append(",");
		sb.append(this.commentCount).append(",");
		sb.append(this.commentStatus).append(",");
		sb.append(this.thumbnail);
		
		return sb.toString();
	}
}