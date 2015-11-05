package com.wet.api.notification.dao;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.h2.tools.RunScript;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.wet.api.notification.dao.SubscriberDao;
import com.wet.api.notification.model.Subscriber;

@Transactional
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/spring/spring.xml"})
public class SubscriberDaoJpaTest
{	
	private static final String JDBC_DRIVER = org.h2.Driver.class.getName();
	private static final String JDBC_URL = "jdbc:h2:mem:notification;DB_CLOSE_DELAY=-1";
	private static final String USER = "sa";
	private static final String PASSWORD = "";
	private static final String SCHEMA_LOCATION = "classpath:META-INF/h2/schema.sql";
	private static final String DATASET_LOCATION = "META-INF/h2/dataset.xml";
	private static final Charset CHARSET = StandardCharsets.UTF_8;
	private static final boolean CONTINUE_ON_ERROR = false;
	
	@Autowired
	@Qualifier("subscriberDaoJpa")
	private SubscriberDao subscriberDao;
	
	@BeforeClass
	public static void createSchema() throws Exception 
	{
		RunScript.execute(JDBC_URL, USER, PASSWORD, SCHEMA_LOCATION, CHARSET, CONTINUE_ON_ERROR);
	}
	
	@Before
	public void importDataSet() throws Exception 
	{
		IDataSet dataSet = readDataSet();
		cleanlyInsertDataset(dataSet);
	}
	
	@Test
	public void testFindById() throws Exception 
	{
		Subscriber expected = new Subscriber();
		expected.setId(1L);
		expected.setFormId((short)1);
		expected.setEmail("test@email.com");
		
		Subscriber actual = subscriberDao.find(1);

		assertThat(actual.getId(), equalTo(expected.getId()));
		assertThat(actual.getFormId(), equalTo(expected.getFormId()));
		assertThat(actual.getEmail(), equalTo(expected.getEmail()));
	}
	
	private IDataSet readDataSet() throws Exception 
	{
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource(DATASET_LOCATION).getFile());
		return new FlatXmlDataSetBuilder().build(file);
	}
	
	private void cleanlyInsertDataset(IDataSet dataSet) throws Exception {
		IDatabaseTester databaseTester = new JdbcDatabaseTester(JDBC_DRIVER, JDBC_URL, USER, PASSWORD);
		databaseTester.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);
		databaseTester.setDataSet(dataSet);
		databaseTester.onSetup();
	}
}