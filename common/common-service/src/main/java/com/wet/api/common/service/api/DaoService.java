package com.wet.api.common.service.api;

import java.sql.Connection;
import java.sql.SQLException;

public interface DaoService 
{
	public Connection getConnection() throws SQLException;
	public void closeConnection() throws SQLException;
}