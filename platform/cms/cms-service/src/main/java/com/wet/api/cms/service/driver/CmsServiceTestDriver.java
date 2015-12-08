package com.wet.api.cms.service.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wet.api.cms.model.Archive;
import com.wet.api.cms.model.ArchiveMonth;
import com.wet.api.cms.model.ArchiveYear;
import com.wet.api.cms.model.Post;
import com.wet.api.cms.model.User;
import com.wet.api.cms.service.ArchiveService;
import com.wet.api.cms.service.PostService;
import com.wet.api.cms.service.UserService;

public class CmsServiceTestDriver 
{	
	@Autowired
	private PostService postService;
	
	@Autowired
	private ArchiveService archiveService;
	
	@Autowired
	private UserService userService;
	
	public void run()
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring.xml");
		postService = (PostService)context.getBean("postRestService");
		archiveService = (ArchiveService)context.getBean("archiveRestService");
		userService = (UserService)context.getBean("userRestService");
		
		Post post1 = postService.findPostById(1097L);
		Post post2 = postService.findPostBySlug("the-piano");
		
		List<Post> posts = postService.findAllPosts();
		
		
		for (Post post : posts)
		{
			System.out.println("Post Title: " + post.getTitle());
			System.out.println("Post Slug: " + post.getSlug());
		}
		
		System.out.println("Post 1 Title" + post1.getTitle());
		System.out.println("Post 2 Title: " + post2.getTitle());
		System.out.println("Post 2 Author: " + post2.getUser().getFirstName());
		System.out.println("Post 2 Author Name: " + post2.getUser().getDisplayName());
		System.out.println("Post 2 Author Slug: " + post2.getUser().getSlug());
		
		
		Archive archive = archiveService.getArchive();
		
		for (ArchiveYear archiveYear : archive.getArchiveYears())
		{
			System.out.println("Year: " + archiveYear.getYear());
			for (ArchiveMonth archiveMonth : archiveYear.getArchiveMonths())
			{
				System.out.println(archiveMonth);
			}
		}
		
		List<Post> careerPosts = postService.findPostsByCategory("Careers", 2, 2);
		for (Post post : careerPosts)
		{
			System.out.println("Title: " + post.getTitle());
			System.out.println("Thumbnail: " + post.getThumbnail());
		}
		
		List<User> users = userService.findAllUsersWithPublishedPosts();
		System.out.println("There are " + users.size() + " users.");
		for (User user : users)
		{
			System.out.println("User: " + user.getDisplayName());
		}
		
		User user = new User();
		//username=myquest97&email=myquest97@gmail.com&nonce=a260bf0bbd&display_name=Mike&user_pass=kingka12
		user.setUsername("test5");
		user.setEmail("test@email.com");
		user.setPassword("secret");
		user.setDisplayName("Bob");
		user.setFirstName("Bob");
		user.setLastName("West");
		userService.register(user);
		
		userService.login(user.getUsername(), user.getPassword());
		User authenticatedUser = userService.getAuthenticatedUser();
		System.out.println("User name: " + authenticatedUser.getFirstName() + " " + authenticatedUser.getLastName());
		System.out.println("Email: " + authenticatedUser.getEmail());
		
		context.close();
	}
	
	public static void main(String[] args) 
	{
		CmsServiceTestDriver testDriver = new CmsServiceTestDriver();
		testDriver.run();
	}
}