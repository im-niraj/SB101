package com.niraj.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility {
	public static Connection provideConnection() {
		Connection connection = null;
		
		
		
		// Load the JDBC driver 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Problem with laoding the Driver main class");
		}
		
		// choose database from local storage
		String database = "jdbc:mysql://localhost:3306/EmployeeRecord";
		

		
		// Establish the connection with the URL, username and password
		try {
			connection = DriverManager.getConnection(database, "root", "12341234");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return connection;
		
	}

}
