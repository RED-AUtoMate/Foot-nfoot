package com.foot.rest.controls;

import java.sql.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class DB {

	private String url = "jdbc:mysql://localhost:3306/ws2";
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


	
	
	
	
	
	
	
	
	
	public void select() {
		try {
			Statement st = this.connection.createStatement();
			ResultSet r = st.executeQuery("select * from Teams");
			while(r.next()) {
				System.out.println(r.getInt("ID"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insert(String table,HashMap<String, String> obj) {
		String query = "INSERT INTO "+table+" ";
		String vals = "(";
		String keys="(";
		
		for(Entry<String, String> entry: obj.entrySet()) {
			vals+="?, ";
			keys+=entry.getKey()+", ";
		}

		vals = vals.substring(0,vals.length()-2);
		vals+=")";
		keys = keys.substring(0,keys.length()-2);
		keys+=")";
		
		query += keys;
		query +=" VALUES ";
		query+=vals;
		
		
		System.out.println(query);
	}
	
	
}
