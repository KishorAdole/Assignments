package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	
		private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
		private static final String URL = "jdbc:mysql://localhost:3306/a01";
		private static final String USER_NAME = "root";
		private static final String PASSWORD = "12345";
		
	/*
	 * A connection (session) with a specific database. SQL statements are executed
	 * and results are returned within the context of a connection.
	 */
		public Connection connection;
		
		public Connection getConnection() throws SQLException, ClassNotFoundException {
			if(connection == null || connection.isClosed()) {
				Class.forName(DRIVER_CLASS);
				connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			}
			return connection;
		}
		
}
