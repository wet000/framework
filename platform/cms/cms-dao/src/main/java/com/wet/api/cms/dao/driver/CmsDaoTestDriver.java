package com.wet.api.cms.dao.driver;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wet.api.cms.dao.TagDao;
import com.wet.api.cms.model.Tag;

public class CmsDaoTestDriver 
{	
	private TagDao tagDao;
	
	public void run()
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/spring.xml");
		tagDao = (TagDao)context.getBean("tagDaoRest");
		List<Tag> tags = tagDao.findAll();
		context.close();
		
		System.out.println("Tags: " + tags);
	}
	
	public static void main(String[] args) 
	{
		CmsDaoTestDriver testDriver = new CmsDaoTestDriver();
		testDriver.run();
	}
}