package com.foot.rest.controls;

import java.sql.*;

public class DB {

	private String url = "jdbc:mysql://localhost:3306/ws2";
	private String user = "imadhou";
	private String password = "math3as..0";

	private Connection connection;
	private static DB instance;
	
	
	public DB() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.connection = DriverManager.getConnection(url, user, password);
		
		Statement st = this.connection.createStatement();
		ResultSet rs = st.executeQuery("select * from Teams");
		while(rs.next()) {
			int id = rs.getInt("ID");
			System.out.println(id);
		}
	}
	
	
}
