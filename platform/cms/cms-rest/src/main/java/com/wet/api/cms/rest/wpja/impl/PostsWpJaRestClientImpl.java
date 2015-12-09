package com.wet.api.cms.rest.wpja.impl;

import org.joda.time.LocalDate;
import org.joda.time.YearMonth;
import org.joda.time.format.DateTimeFormat;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.wpja.PostsWpJaWrapper;
import com.wet.api.cms.rest.wpja.PostsWpJaRestClient;
import com.wet.api.common.rest.impl.AbstractSpringRestClient;

@Service("postsWpJaRestClientImpl")
public class PostsWpJaRestClientImpl extends AbstractSpringRestClient<PostsWpJaWrapper> implements PostsWpJaRestClient<PostsWpJaWrapper> 
{
	private static final String METHOD_GET_POSTS 			= "get_posts";
	private static final String METHOD_GET_RECENT_POSTS 	= "get_recent_posts";
	private static final String METHOD_GET_DATE_POSTS		= "get_date_posts";
	private static final String METHOD_GET_CATEGORY_POSTS 	= "get_category_posts";
	private static final String METHOD_GET_TAG_POSTS		= "get_tag_posts";
	private static final String METHOD_GET_USER_POSTS		= "get_author_posts";
	private static final String METHOD_GET_SEARCH_RESULTS	= "get_search_results";
	
	private static final String PARAM_COUNT 				= "count";
	private static final String PARAM_PAGE 					= "page";
	private static final String PARAM_DATE 					= "date";
	private static final String PARAM_ID 					= "id";
	private static final String PARAM_SLUG					= "slug";
	private static final String PARAM_SEARCH				= "search";
	
	private String baseUri = System.getenv("OPENSHIFT_WP_BASEURL") + "/api/core/";
	
	public PostsWpJaRestClientImpl()
	{
		super(PostsWpJaWrapper.class);
	}
	
	@Override
	public String getBaseUri() 
	{
		return baseUri;
	}

	@Override
	public PostsWpJaWrapper getPosts() 
	{
		setMethod(METHOD_GET_POSTS);
		return get();
	}

	@Override
	public PostsWpJaWrapper getPosts(int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_POSTS);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getRecentPosts(int count)
	{
		setMethod(METHOD_GET_RECENT_POSTS);
		putParam(PARAM_COUNT, count);
		return get();
	}

	@Override
	public PostsWpJaWrapper getDatePosts(int year) 
	{
		setMethod(METHOD_GET_DATE_POSTS);
		putParam(PARAM_DATE, year);
		return get();
	}

	@Override
	public PostsWpJaWrapper getDatePosts(YearMonth yearMonth) 
	{
		setMethod(METHOD_GET_DATE_POSTS);
		putParam(PARAM_DATE, DateTimeFormat.forPattern("yyyyMM").print(yearMonth));
		return get();
	}

	@Override
	public PostsWpJaWrapper getDatePosts(LocalDate date) 
	{
		setMethod(METHOD_GET_DATE_POSTS);
		putParam(PARAM_DATE, DateTimeFormat.forPattern("yyyyMMdd").print(date));
		return get();
	}

	@Override
	public PostsWpJaWrapper getDatePosts(int year, int countPerPage, int pageNumber)
	{
		setMethod(METHOD_GET_DATE_POSTS);
		putParam(PARAM_DATE, year);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getDatePosts(YearMonth yearMonth, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_DATE_POSTS);
		putParam(PARAM_DATE, DateTimeFormat.forPattern("yyyyMM").print(yearMonth));
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getDatePosts(LocalDate date, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_DATE_POSTS);
		putParam(PARAM_DATE, DateTimeFormat.forPattern("yyyyMMdd").print(date));
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getCategoryPosts(long categoryId) 
	{
		setMethod(METHOD_GET_CATEGORY_POSTS);
		putParam(PARAM_ID, categoryId);
		return get();
	}

	@Override
	public PostsWpJaWrapper getCategoryPosts(String categorySlug) 
	{
		setMethod(METHOD_GET_CATEGORY_POSTS);
		putParam(PARAM_SLUG, categorySlug);
		return get();
	}

	@Override
	public PostsWpJaWrapper getCategoryPosts(long categoryId, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_CATEGORY_POSTS);
		putParam(PARAM_ID, categoryId);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getCategoryPosts(String categorySlug, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_CATEGORY_POSTS);
		putParam(PARAM_SLUG, categorySlug);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getTagPosts(long tagId) 
	{
		setMethod(METHOD_GET_TAG_POSTS);
		putParam(PARAM_ID, tagId);
		return get();
	}

	@Override
	public PostsWpJaWrapper getTagPosts(String tagSlug) 
	{
		setMethod(METHOD_GET_TAG_POSTS);
		putParam(PARAM_SLUG, tagSlug);
		return get();
	}

	@Override
	public PostsWpJaWrapper getTagPosts(long tagId, int countPerPage, int pageNumber)
	{
		setMethod(METHOD_GET_TAG_POSTS);
		putParam(PARAM_ID, tagId);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getTagPosts(String tagSlug, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_TAG_POSTS);
		putParam(PARAM_SLUG, tagSlug);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getUserPosts(long userId) 
	{
		setMethod(METHOD_GET_USER_POSTS);
		putParam(PARAM_ID, userId);
		return get();
	}

	@Override
	public PostsWpJaWrapper getUserPosts(String userSlug) 
	{
		setMethod(METHOD_GET_USER_POSTS);
		putParam(PARAM_SLUG, userSlug);
		return get();
	}

	@Override
	public PostsWpJaWrapper getUserPosts(long userId, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_USER_POSTS);
		putParam(PARAM_ID, userId);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getUserPosts(String userSlug, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_USER_POSTS);
		putParam(PARAM_SLUG, userSlug);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}

	@Override
	public PostsWpJaWrapper getSearchResults(String search) 
	{
		setMethod(METHOD_GET_SEARCH_RESULTS);
		putParam(PARAM_SEARCH, search);
		return get();
	}

	@Override
	public PostsWpJaWrapper getSearchResults(String search, int countPerPage, int pageNumber) 
	{
		setMethod(METHOD_GET_SEARCH_RESULTS);
		putParam(PARAM_SEARCH, search);
		putParam(PARAM_COUNT, countPerPage);
		putParam(PARAM_PAGE, pageNumber);
		return get();
	}
}