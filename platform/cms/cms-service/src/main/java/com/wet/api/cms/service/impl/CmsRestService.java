package com.wet.api.cms.service.impl;

import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.YearMonth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wet.api.cms.model.Archive;
import com.wet.api.cms.model.Author;
import com.wet.api.cms.model.Category;
import com.wet.api.cms.model.Post;
import com.wet.api.cms.model.Tag;
import com.wet.api.cms.model.wpja.ArchiveWpJaWrapper;
import com.wet.api.cms.model.wpja.AuthorsWpJaWrapper;
import com.wet.api.cms.model.wpja.CategoriesWpJaWrapper;
import com.wet.api.cms.model.wpja.PostWpJaWrapper;
import com.wet.api.cms.model.wpja.PostsWpJaWrapper;
import com.wet.api.cms.model.wpja.TagsWpJaWrapper;
import com.wet.api.cms.rest.wpja.ArchiveWpJaRestClient;
import com.wet.api.cms.rest.wpja.AuthorsWpJaRestClient;
import com.wet.api.cms.rest.wpja.CategoriesWpJaRestClient;
import com.wet.api.cms.rest.wpja.PostWpJaRestClient;
import com.wet.api.cms.rest.wpja.PostsWpJaRestClient;
import com.wet.api.cms.rest.wpja.TagsWpJaRestClient;
import com.wet.api.cms.service.CmsService;

@Service("cmsRestService")
public class CmsRestService implements CmsService 
{
	@Autowired
	private ArchiveWpJaRestClient<ArchiveWpJaWrapper> archiveWpJaRestClient;
	
	@Autowired
	private AuthorsWpJaRestClient<AuthorsWpJaWrapper> authorsWpJaRestClient;
	
	@Autowired
	private CategoriesWpJaRestClient<CategoriesWpJaWrapper> categoriesWpJaRestClient;
	
	@Autowired
	private PostsWpJaRestClient<PostsWpJaWrapper> postsWpJaRestClient;
	
	@Autowired
	private PostWpJaRestClient<PostWpJaWrapper> postWpJaRestClient;
	
	@Autowired
	private TagsWpJaRestClient<TagsWpJaWrapper> tagWpJaRestClient;
	
//	@Override
//	public List<Post> findAll()
//	{
//		return this.postsWpRestClient.getPosts().getPosts();
//	}
//
//	@Override
//	public Archive getArchive() 
//	{
//		return archiveWpJaRestClient.getDateIndex().getArchive();
//	}
//	
	

	@Override
	public Archive getArchive()
	{
		return this.archiveWpJaRestClient.getDateIndex().getArchive();
	}

	@Override
	public List<Author> findAllAuthors()
	{
		return this.authorsWpJaRestClient.getAuthorIndex().getAuthors();
	}

	@Override
	public List<Category> findAllCategories()
	{
		return this.categoriesWpJaRestClient.getCategoryIndex().getCategories();
	}

	@Override
	public List<Category> findAllSubCategories(int parentId) 
	{
		return this.categoriesWpJaRestClient.getSubCategoryIndex(parentId).getCategories();
	}

	@Override
	public List<Tag> findAllTags() 
	{
		return this.tagWpJaRestClient.getTagIndex().getTags();
	}

	@Override
	public Post findPostById(long id) 
	{
		return this.postWpJaRestClient.getPost(id).getPost();
	}

	@Override
	public Post findPostBySlug(String slug) 
	{
		return this.postWpJaRestClient.getPost(slug).getPost();
	}

	@Override
	public List<Post> findAllPosts() 
	{
		return this.postsWpJaRestClient.getPosts().getPosts();
	}

	@Override
	public List<Post> findAllPosts(int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getPosts(countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findRecentPosts(int count) 
	{
		return this.postsWpJaRestClient.getRecentPosts(count).getPosts();
	}

	@Override
	public List<Post> findPostsByDate(int year) 
	{
		return this.postsWpJaRestClient.getDatePosts(year).getPosts();
	}

	@Override
	public List<Post> findPostsByDate(YearMonth yearMonth) 
	{
		return this.postsWpJaRestClient.getDatePosts(yearMonth).getPosts();
	}

	@Override
	public List<Post> findPostsByDate(LocalDate date) 
	{
		return this.postsWpJaRestClient.getDatePosts(date).getPosts();
	}

	@Override
	public List<Post> findPostsByDate(int year, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getDatePosts(year, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByDate(YearMonth yearMonth, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getDatePosts(yearMonth, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByDate(LocalDate date, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getDatePosts(date, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByCategory(long categoryId) 
	{
		return this.postsWpJaRestClient.getCategoryPosts(categoryId).getPosts();
	}

	@Override
	public List<Post> findPostsByCategory(String categorySlug) 
	{
		return this.postsWpJaRestClient.getCategoryPosts(categorySlug).getPosts();
	}

	@Override
	public List<Post> findPostsByCategory(long categoryId, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getCategoryPosts(categoryId, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByCategory(String categorySlug, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getCategoryPosts(categorySlug, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByTag(long tagId) 
	{
		return this.postsWpJaRestClient.getTagPosts(tagId).getPosts();
	}

	@Override
	public List<Post> findPostsByTag(String tagSlug) 
	{
		return this.postsWpJaRestClient.getTagPosts(tagSlug).getPosts();
	}

	@Override
	public List<Post> findPostsByTag(long tagId, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getTagPosts(tagId, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByTag(String tagSlug, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getTagPosts(tagSlug, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByAuthor(long authorId) 
	{
		return this.postsWpJaRestClient.getAuthorPosts(authorId).getPosts();
	}

	@Override
	public List<Post> findPostsByAuthor(String authorSlug) 
	{
		return this.postsWpJaRestClient.getAuthorPosts(authorSlug).getPosts();
	}

	@Override
	public List<Post> findPostsByAuthor(long authorId, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getAuthorPosts(authorId, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByAuthor(String authorSlug, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getAuthorPosts(authorSlug, countPerPage, pageNumber).getPosts();
	}

	@Override
	public List<Post> findPostsByKeywords(String keywords) 
	{
		return this.postsWpJaRestClient.getSearchResults(keywords).getPosts();
	}

	@Override
	public List<Post> findPostsByKeywords(String keywords, int countPerPage, int pageNumber) 
	{
		return this.postsWpJaRestClient.getSearchResults(keywords, countPerPage, pageNumber).getPosts();
	}
}