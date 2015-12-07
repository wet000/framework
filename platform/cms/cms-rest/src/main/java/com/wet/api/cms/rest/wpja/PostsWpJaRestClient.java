package com.wet.api.cms.rest.wpja;

import org.joda.time.LocalDate;
import org.joda.time.YearMonth;

import com.wet.api.cms.rest.PostsRestClient;
import com.wet.api.common.model.DomainObject;

public interface PostsWpJaRestClient <T extends DomainObject> extends PostsRestClient<T>
{
	public T getPosts();
	public T getPosts(int countPerPage, int pageNumber);
	public T getRecentPosts(int count);
	public T getDatePosts(int year);
	public T getDatePosts(YearMonth yearMonth);
	public T getDatePosts(LocalDate date);
	public T getDatePosts(int year, int countPerPage, int pageNumber);
	public T getDatePosts(YearMonth yearMonth, int countPerPage, int pageNumber);
	public T getDatePosts(LocalDate date, int countPerPage, int pageNumber);
	public T getCategoryPosts(long categoryId);
	public T getCategoryPosts(String categorySlug);
	public T getCategoryPosts(long categoryId, int countPerPage, int pageNumber);
	public T getCategoryPosts(String categorySlug, int countPerPage, int pageNumber);
	public T getTagPosts(long tagId);
	public T getTagPosts(String tagSlug);
	public T getTagPosts(long tagId, int countPerPage, int pageNumber);
	public T getTagPosts(String tagSlug, int countPerPage, int pageNumber);
	public T getUserPosts(long userId);
	public T getUserPosts(String userSlug);
	public T getUserPosts(long userId, int countPerPage, int pageNumber);
	public T getUserPosts(String userSlug, int countPerPage, int pageNumber);
	public T getSearchResults(String search);
	public T getSearchResults(String search, int countPerPage, int pageNumber);
}