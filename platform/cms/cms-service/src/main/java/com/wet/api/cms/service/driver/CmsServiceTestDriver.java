package com.wet.api.cms.service.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wet.api.cms.model.Archive;
import com.wet.api.cms.model.ArchiveMonth;
import com.wet.api.cms.model.ArchiveYear;
import com.wet.api.cms.model.Post;
import com.wet.api.cms.service.CmsService;

public class CmsServiceTestDriver 
{	
	@Autowired
	private CmsService cmsService;
	
	public void run()
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring.xml");
		cmsService = (CmsService)context.getBean("cmsRestService");
		
		Post post1 = cmsService.findPostById(1097L);
		Post post2 = cmsService.findPostBySlug("the-piano");
		
		List<Post> posts = cmsService.findAllPosts();
		
		
		for (Post post : posts)
		{
			System.out.println("Post Title: " + post.getTitle());
			System.out.println("Post Slug: " + post.getSlug());
		}
		
		System.out.println("Post 1 Title" + post1.getTitle());
		System.out.println("Post 2 Title: " + post2.getTitle());
		System.out.println("Post 2 Author: " + post2.getAuthor().getFirstName());
		
		
		Archive archive = cmsService.getArchive();
		
		for (ArchiveYear archiveYear : archive.getArchiveYears())
		{
			System.out.println("Year: " + archiveYear.getYear());
			for (ArchiveMonth archiveMonth : archiveYear.getArchiveMonths())
			{
				System.out.println(archiveMonth);
			}
		}
		
		List<Post> careerPosts = cmsService.findPostsByCategory("Careers");
		for (Post post : careerPosts)
		{
			System.out.println("Title: " + post.getTitle());
		}
		
		context.close();
	}
	
	public static void main(String[] args) 
	{
		CmsServiceTestDriver testDriver = new CmsServiceTestDriver();
		testDriver.run();
	}
}