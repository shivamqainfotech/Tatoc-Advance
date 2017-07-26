package com.qait.tatocAdvance.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JDBC {
	
	static ResourceBundle rs = ResourceBundle.getBundle("Resources.credentials");
	 Connection con=null;
	
	public Connection getConnection() throws SQLException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection(rs.getString("url"), rs.getString("user"), rs.getString("password"));
		} catch (ClassNotFoundException e) {
			System.out.println("Exception occured in getConnection() method");
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
