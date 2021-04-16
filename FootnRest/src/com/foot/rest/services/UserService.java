package com.foot.rest.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.foot.rest.controls.DB;
import com.foot.rest.models.User;

public class UserService {

	private DB db = DB.getInstance();
	
	
	public String insert(User user) {
		String query = "INSERT INTO Users (LastName, FirsName, Email, password) VALUES (?,?,?,?)";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setString(1, user.getLastName());
			st.setString(2, user.getFirsName());
			st.setString(3, user.getEmail());
			st.setString(4, user.getPassword());
			
			if(st.executeUpdate() > 0) {
				return "User Created successfully";
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Error while adding user";
	}
	
	
	
	
	public User select(String email) {
		String query = "SELECT * FROM Users WHERE Emeil = ?";
		try {
			
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setString(1, email);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				User u = new User();
				
				u.setId(rs.getInt("ID"));
				u.setEmail(rs.getString("Email"));
				u.setFirsName(rs.getString("FirstName"));
				u.setLastName(rs.getString("LastName"));
				u.setPassword(rs.getString("password"));
				return u;
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	

}
