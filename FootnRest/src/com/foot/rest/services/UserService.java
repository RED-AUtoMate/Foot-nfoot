package com.foot.rest.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.foot.rest.controls.DB;
import com.foot.rest.models.User;

public class UserService {

	private DB db = DB.getInstance();
	
	
	public User insert(User user) {
		String query = "INSERT INTO Users (LastName, FirstName, Email, passowrd) VALUES (?,?,?,?)";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setString(1, user.getLastName());
			st.setString(2, user.getFirsName());
			st.setString(3, user.getEmail());
			st.setString(4, user.getPassword());
			
			if(st.executeUpdate() > 0) {
				return this.select(user.getEmail());
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	public User select(String email) {
		String query = "SELECT * FROM Users WHERE Email = ?";
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
				u.setPassword(rs.getString("passowrd"));
				System.out.println(u.toString()+"hhhhhhh");
				return u;
			}			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
	public User updateUser(int id_user, User user) {
		String query = "UPDATE Users SET ID = ?, LastName = ?, FirstName = ?, Email = ?, passowrd= ? WHERE ID = ?";
		
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, id_user);
			st.setString(2, user.getLastName());
			st.setString(3, user.getFirsName());
			st.setString(4, user.getEmail());
			st.setString(5, user.getPassword());
			st.setInt(6, id_user);
			
			if(st.executeUpdate() > 0) {
				return this.select(user.getEmail());
			}
				
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	public String deleteUser(int id_user) {
		String query = "DELETE FROM Users WHERE ID = ?";
		
		try {
			
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, id_user);
			
			if(st.executeUpdate() > 0) {
				return "User deleted  succefully";
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Error while deleting resource";
		
	}
	

}






