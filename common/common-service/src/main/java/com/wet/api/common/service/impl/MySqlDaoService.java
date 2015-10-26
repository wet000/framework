package com.wet.api.common.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.wet.api.common.service.api.DaoService;

public class MySqlDaoService implements DaoService
{
	private static Connection connection;
	
	private static final String HOST = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
	private static final String PORT = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
	private static final String USER = System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
	private static final String PASSWORD = System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
	private static final String DATABASE = "notification";
	
	public Connection getConnection() throws SQLException 
	{
		if (connection == null || !connection.isValid(0))
		{
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
            }
            catch (ClassNotFoundException e)
            {
                throw new RuntimeException(e);
            }

            StringBuilder url = new StringBuilder("jdbc:mysql://")
            		.append(HOST).append(":").append(PORT).append("/")
            		.append(DATABASE)
            		.append("?user=" ).append(USER)
            		.append("&password=").append(PASSWORD);

            connection = DriverManager.getConnection(url.toString());
		}
		
		return connection;
	}

	public void closeConnection() throws SQLException 
	{
		connection.close();
	}
}