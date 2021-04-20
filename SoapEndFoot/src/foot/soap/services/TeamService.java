package foot.soap.services;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import foot.soap.controls.DB;
import foot.soap.models.Team;



public class TeamService {
	
	private DB db = DB.getInstance();

	
	public ArrayList<Team> getAllTeams(String league_code){
		
		ArrayList<Team> teams = new ArrayList<Team>();
		String query = "SELECT * FROM Teams WHERE league = (SELECT ID FROM Leagues where league_code = ?)";
		
		
		try {
			PreparedStatement st = this.db.getConnection().prepareStatement(query);
			st.setString(1, league_code);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				Team tm = new Team();
				
				tm.setBc(rs.getInt("bc"));
				tm.setBp(rs.getInt("bp"));
				tm.setClassment(rs.getInt("classment"));
				tm.setId(rs.getInt("ID"));
				tm.setLast_result(rs.getString("last_result"));
				tm.setLeague(rs.getInt("league"));
				tm.setPts(rs.getInt("pts"));
				tm.setTeam_name(rs.getString("team_name"));
				
				teams.add(tm);
			}
			return teams;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		return null;
	}
	
	
	public Team getTeamById(int id_team) {
		String query = "SELECT * FROM Teams WHERE ID = ?";
		
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, id_team);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				Team tm = new Team();
				
				tm.setBc(rs.getInt("bc"));
				tm.setBp(rs.getInt("bp"));
				tm.setClassment(rs.getInt("classment"));
				tm.setId(rs.getInt("ID"));
				tm.setLast_result(rs.getString("last_result"));
				tm.setLeague(rs.getInt("league"));
				tm.setPts(rs.getInt("pts"));
				tm.setTeam_name(rs.getString("team_name"));
				
				return tm;
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	
	
	
	public Team createTeam(Team team) {
		
		String query = "INSERT INTO Teams (ID, team_name, classment, pts, bp, bc, league, last_result) VALUES (?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, team.getId());
			st.setString(2, team.getTeam_name());
			st.setInt(3, team.getClassment());
			st.setInt(4, team.getPts());
			st.setInt(5, team.getBp());
			st.setInt(6, team.getBc());
			st.setInt(7, team.getLeague());
			st.setString(8, team.getLast_result());
			
			if(st.executeUpdate() > 0) {
				return team;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	public Team updateTeam(int id_team, Team team) {
		String query = "UPDATE Teams SET team_name = ?, classment = ?, pts = ?, bp = ?, bc = ?, league = ?, last_result = ? WHERE ID = ?";
		
		try {
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setString(1, team.getTeam_name());
			st.setInt(2, team.getClassment());
			st.setInt(3, team.getPts());
			st.setInt(4, team.getBp());
			st.setInt(5, team.getBc());
			st.setInt(6, team.getLeague());
			st.setString(7, team.getLast_result());
			st.setInt(8, id_team);
			
			if(st.executeUpdate() > 0) {
				return team;
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	

	public String deleteTeame(int id_team) {
		String query = "DELETE FROM Teams WHERE ID = ?";
		
		try {
			
			PreparedStatement st = db.getConnection().prepareStatement(query);
			st.setInt(1, id_team);
			
			if(st.executeUpdate() > 0) {
				return "Teame Deleted successfully";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "Error while deleting resource";
		
	}
	

}
