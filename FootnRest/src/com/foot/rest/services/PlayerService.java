package com.foot.rest.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
				player.setID(rs.getInt("ID"));
				return player;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Players updatePlayer (String post, String league_code, Players player) {
		String reqest = "UPDATE Players SET  LastName = ?, FirstName = ?, post = ?, Age = ?, player_league = ?, player_team = ?, Score = ? WHERE ( post = ? AND player_league = (SELECT ID FROM Leagues WHERE league_code = ?) )";
		try {
			PreparedStatement st = db.getConnection().prepareStatement(reqest);
			st.setString(1, player.getLastName());
			st.setString(2, player.getFirstName());
			st.setString(3, player.getPost());
			st.setInt(4, player.getAge());
			st.setInt(5, player.getPlayer_league());
			st.setInt(6, player.getPlayer_team());
			st.setInt(7, player.getScore());
			st.setString(8,post);
			st.setString(9, league_code);
			st.executeUpdate();
			
			return this.getPlayerById(player.getID());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	public Players getBestPlayer (String leagueCode, String post) {
		String query = "SELECT * FROM Players WHERE (post = ? AND player_league = ( SELECT ID FROM Leagues  WHERE league_code = ?))";
		Players player = new Players();
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setString(1, post);
			st.setString(2, leagueCode);
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
		return null;
	}

	public ArrayList<Players> getBestPlayers (String leagueCode) {
		ArrayList<Players> players = new ArrayList<Players>();
		String query = "SELECT * FROM Players WHERE (player_league = ( SELECT ID FROM Leagues  WHERE league_code = ?))";
		
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setString(1, leagueCode);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Players player = new Players();
				player.setID(rs.getInt("ID"));
				player.setLastName(rs.getString("LastName"));
				player.setFirstName(rs.getString("FirstName"));
				player.setPost(rs.getString("Post"));	
				player.setAge(rs.getInt("age"));
				player.setPlayer_league(rs.getInt("player_league"));
				player.setPlayer_team(rs.getInt("player_team"));
				player.setScore(rs.getInt("score"));
				players.add(player);	
			}	
			return players;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public int deletePlayerByPostAndLeague(String post, String codeLeague) {
        String query = "DELETE FROM Players \n" +
                "WHERE (\n" +
                "   post = ? AND\n" +
                "   player_league = (\n" +
                "       SELECT ID FROM Leagues \n" +
                "       WHERE league_code = ? \n" +
                "       )\n" +
                ")";
        try {
            PreparedStatement st = db.getConnection().prepareStatement(query);
            st.setString(1, post);
            st.setString(2, codeLeague);
            if(st.executeUpdate() > 0) {
            	 return 0;
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
	
	public Players addPlayer (Players player, String leaguecode){
        String query = "INSERT INTO Players (LastName, FirstName, post, Age, player_league, player_team, Score) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = db.getConnection().prepareStatement(query);
            st.setString(1, player.getLastName());
            st.setString(2, player.getFirstName());
            st.setString(3, player.getPost());
            st.setInt(4, player.getAge());
            st.setInt(5, player.getPlayer_league());
            st.setInt(6, player.getPlayer_team());
            st.setInt(7, player.getScore());
            st.execute();
            return this.getBestPlayer(leaguecode, player.getPost());
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return null;

    }
	
	
}