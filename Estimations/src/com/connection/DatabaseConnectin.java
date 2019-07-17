package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnectin {
	public static Connection getDbConnectin(){
		String url="jdbc:mysql://localhost:3306/engineerestimation";
		String username="root";
		String password="root";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			if (con != null) {
				return con;
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return null;
	}
	

}
