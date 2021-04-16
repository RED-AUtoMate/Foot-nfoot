package com.foot.rest.controls;

import java.sql.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class DB {

	private String url = "jdbc:mysql://localhost:3306/FootNFoot";
	private String user = "imadhou";
	private String password = "math3as..0";

	private Connection connection;
	private static DB instance;
	
	
	private DB() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.connection = DriverManager.getConnection(url, user, password);
	}
	
	public static DB getInstance() {
		
		if(DB.instance == null) {
			try {
				DB.instance = new DB();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return DB.instance;
	}

	public Connection getConnection() {
		return connection;
	}


	
	
	

	
	
}
