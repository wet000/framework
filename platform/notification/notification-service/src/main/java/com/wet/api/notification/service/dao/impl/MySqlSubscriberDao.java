package com.wet.api.notification.service.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;

import javax.inject.Named;

import com.wet.api.common.service.impl.MySqlDaoService;
import com.wet.api.notification.model.Subscriber;
import com.wet.api.notification.service.dao.SubscriberDao;

@Named
public class MySqlSubscriberDao extends MySqlDaoService implements SubscriberDao 
{
	@Override
	public boolean save(Subscriber subscriber) 
	{
		boolean saved = false;
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		StringBuilder sql = new StringBuilder("INSERT INTO ")
				.append(TABLE_NAME)
				.append(" (form_id,email,active,confirmed,create_date,activate_date,deactivate_date,confirm_date,last_modified)")
				.append(" VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")
				.append(" ON DUPLICATE KEY UPDATE")
				.append(" form_id=?, email=?, active=?, confirmed=?, create_date=?, activate_date=?, deactivate_date=?, confirm_date=?, last_modified=?");

		try
		{
			connection = getConnection();
			statement = loadPreparedStatement(subscriber, connection, sql.toString());
			saved = statement.executeUpdate() > 0;
	        resultSet = statement.getGeneratedKeys();
	        if (resultSet.first())
	        {
	        	subscriber.setId(resultSet.getInt(1));
	        }	
		}
		catch (SQLException e)
		{
			// TODO: log error
			saved = false;
		}
		finally
		{
			try
			{
				statement.close();
				closeConnection();
			}
			catch (SQLException e)
			{
				// TODO: log error
				saved = false;
			}
		}

		return saved;
	}
	
	private PreparedStatement loadPreparedStatement(Subscriber subscriber, Connection connection, String sql) throws SQLException
	{
		PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		statement.setInt(1, subscriber.getFormId());
		statement.setString(2, subscriber.getEmail());
		statement.setBoolean(3, subscriber.isActive());
		statement.setBoolean(4, subscriber.isConfirmed());
		statement.setTimestamp(5, new Timestamp(subscriber.getCreateDate().getMillis()));
		statement.setTimestamp(6, new Timestamp(subscriber.getActivateDate().getMillis()));
		statement.setTimestamp(7, subscriber.getDeactivateDate() == null ? null : new Timestamp(subscriber.getDeactivateDate().getMillis()));
		statement.setTimestamp(8, subscriber.getConfirmDate() == null ? null : new Timestamp(subscriber.getConfirmDate().getMillis()));
		statement.setTimestamp(9, new Timestamp(subscriber.getLastModified().getMillis()));
		statement.setInt(10, subscriber.getFormId());
		statement.setString(11, subscriber.getEmail());
		statement.setBoolean(12, subscriber.isActive());
		statement.setBoolean(13, subscriber.isConfirmed());
		statement.setTimestamp(14, new Timestamp(subscriber.getCreateDate().getMillis()));
		statement.setTimestamp(15, new Timestamp(subscriber.getActivateDate().getMillis()));
		statement.setTimestamp(16, subscriber.getDeactivateDate() == null ? null : new Timestamp(subscriber.getDeactivateDate().getMillis()));
		statement.setTimestamp(17, subscriber.getConfirmDate() == null ? null : new Timestamp(subscriber.getConfirmDate().getMillis()));
		statement.setTimestamp(18, new Timestamp(subscriber.getLastModified().getMillis()));
		
		return statement;
	}
}