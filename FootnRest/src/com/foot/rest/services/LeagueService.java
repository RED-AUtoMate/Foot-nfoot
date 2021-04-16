package com.foot.rest.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.foot.rest.controls.DB;
import com.foot.rest.models.League;

public class LeagueService {
	
	DB db = DB.getInstance();

	
	public League getLeagueById(int id_League) {
		String query = "SELECT * FROM Leagues WHERE ID = ?";
		try {
			
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, id_League);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				League league = new League();
				league.setId(rs.getInt("ID"));
				league.setLeague_code(rs.getString("league_code"));
				league.setLeague_country(rs.getString("league_country"));
				league.setLeague_name(rs.getString("league_name"));
				
				return league;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void createLeague(League league) {
		
		String reqest = "INSERT INTO Leagues (league_code, league_country, league_name) VALUES(?,?,?)";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(reqest);
			st.setString(1, league.getLeague_code());
			st.setString(2, league.getLeague_country());
			st.setString(3, league.getLeague_name());	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateLeague(int id_League, League league) {
		
		String reqest = "UPDATE League SET league_name = ? league_code = ? league_country = ? WHERE ID = ?";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(reqest);
			st.setString(1, league.getLeague_name());
			st.setString(2, league.getLeague_code());
			st.setString(3, league.getLeague_country());	
			st.setInt(4, id_League);			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

	public void deleteLeague(int id_League) {
		String reqest = "DELETE FROM Leagues where ID = ?";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(reqest);
			st.setInt	(1, id_League);		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
