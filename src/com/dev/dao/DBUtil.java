package com.dev.dao;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;

import org.apache.log4j.Logger;

import com.dev.prop.PropReader;

public class DBUtil {
	private static Logger log = Logger.getLogger(DBUtil.class);

	/**************************************************************************************
	 * This method return the connection.If it will get connection it return the
	 * Connection object else null.
	 * 
	 * @return conn as <code>Connection</code>
	 * @throws SQLException
	 **************************************************************************************/
	public static Connection getConnection() throws SQLException {

		Connection connection = null;

		try {
			
			OracleDataSource ds = new OracleDataSource();
			ds.setDriverType(PropReader.getUniqueInstance().getDriverType());// driver
																				// type
			ds.setServerName(PropReader.getUniqueInstance().getServerName());
			ds.setPortNumber(PropReader.getUniqueInstance().getPortNo()); // portname
			ds.setDatabaseName(PropReader.getUniqueInstance().getSID()); // sid
			ds.setUser(PropReader.getUniqueInstance().getUser()); // User
			ds.setPassword(PropReader.getUniqueInstance().getPasswd()); // Password
			
			connection = ds.getConnection();

		} catch (SQLException sqlException) {
			sqlException.printStackTrace();
			log.error("Error occured : " + sqlException);
			throw sqlException;
		}

		return connection;
	}

}
