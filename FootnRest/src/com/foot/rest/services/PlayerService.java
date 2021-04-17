package com.foot.rest.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.foot.rest.controls.DB;
import com.foot.rest.models.League;
import com.foot.rest.models.Players;
import com.mysql.cj.protocol.Resultset;

public class PlayerService {	
	DB db = DB.getInstance();
	public Players getPlayerById (int id) {
		String query = "SELECT * FROM Players WHERE ID = ?";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, id);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				Players player = new Players();
				player.setLastName(rs.getString("LastName"));
				player.setFirstName(rs.getString("FirstName"));
				player.setPost(rs.getString("post"));
				player.setAge(rs.getInt("Age"));
				player.setPlayer_league(rs.getInt("player_league"));
				player.setPlayer_team(rs.getInt("player_team"));
				player.setScore(rs.getInt("Score"));
				return player;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void updatePlayer (int id, Players player) {
		String reqest = "UPDATE Player SET LastName = ? FirstName = ? Post = ? Age = ? player_league = ? player_team = ? score = ? WHERE ID = ?";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(reqest);
			st.setString(1, player.getLastName());
			st.setString(2, player.getFirstName());
			st.setString(3, player.getPost());
			st.setInt(4, player.getAge());
			st.setInt(5, player.getPlayer_league());
			st.setInt(6, player.getPlayer_team());
			st.setInt(7, player.getScore());
			st.setInt(8, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Players getBestPlayer (int leagueId, String post) {
		String query = "SELECT * FROM Players WHERE player_league = ? and post = '" + post + "'";	
		Players player = new Players();
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, leagueId);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				player.setID(rs.getInt("ID"));
				player.setLastName(rs.getString("LastName"));
				player.setFirstName(rs.getString("FirstName"));
				player.setFirstName(rs.getString("Post"));
				player.setPost(rs.getString("Post"));	
				player.setAge(rs.getInt("age"));
				player.setPlayer_league(rs.getInt("player_league"));
				player.setPlayer_team(rs.getInt("player_team"));
				player.setScore(rs.getInt("score"));
				return player;	
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return player;
	}
}