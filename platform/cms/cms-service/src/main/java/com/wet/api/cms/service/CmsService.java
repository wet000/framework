package com.wet.api.cms.service;

import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.YearMonth;

import com.wet.api.cms.model.Archive;
import com.wet.api.cms.model.Author;
import com.wet.api.cms.model.Category;
import com.wet.api.cms.model.Post;
import com.wet.api.cms.model.Tag;
import com.wet.api.common.service.CommonService;

public interface CmsService extends CommonService
{
	public Archive getArchive();
	public List<Author> findAllAuthors();
	public List<Category> findAllCategories();
	public List<Category> findAllSubCategories(int parentId);
	public List<Tag> findAllTags();
	public Post findPostById(long id);
	public Post findPostBySlug(String slug);
	public List<Post> findAllPosts();
	public List<Post> findAllPosts(int countPerPage, int pageNumber);
	public List<Post> findRecentPosts(int count);
	public List<Post> findPostsByDate(int year);
	public List<Post> findPostsByDate(YearMonth yearMonth);
	public List<Post> findPostsByDate(LocalDate date);
	public List<Post> findPostsByDate(int year, int countPerPage, int pageNumber);
	public List<Post> findPostsByDate(YearMonth yearMonth, int countPerPage, int pageNumber);
	public List<Post> findPostsByDate(LocalDate date, int countPerPage, int pageNumber);
	public List<Post> findPostsByCategory(long categoryId);
	public List<Post> findPostsByCategory(String categorySlug);
	public List<Post> findPostsByCategory(long categoryId, int countPerPage, int pageNumber);
	public List<Post> findPostsByCategory(String categorySlug, int countPerPage, int pageNumber);
	public List<Post> findPostsByTag(long tagId);
	public List<Post> findPostsByTag(String tagSlug);
	public List<Post> findPostsByTag(long tagId, int countPerPage, int pageNumber);
	public List<Post> findPostsByTag(String tagSlug, int countPerPage, int pageNumber);
	public List<Post> findPostsByAuthor(long authorId);
	public List<Post> findPostsByAuthor(String authorSlug);
	public List<Post> findPostsByAuthor(long authorId, int countPerPage, int pageNumber);
	public List<Post> findPostsByAuthor(String authorSlug, int countPerPage, int pageNumber);
	public List<Post> findPostsByKeywords(String keywords);
	public List<Post> findPostsByKeywords(String keywords, int countPerPage, int pageNumber);
}