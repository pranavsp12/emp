package com.tcs.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {
	
	@Autowired
	DataSource dataSource;
	public  Connection getConnection() {
		
		Connection connection = null;
		try {
			connection = dataSource.getConnection();
			connection.setAutoCommit(false);
			return connection;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void closeConnection(Connection connection) {
		
		try {
			connection.close();
			System.out.println("close connection");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
