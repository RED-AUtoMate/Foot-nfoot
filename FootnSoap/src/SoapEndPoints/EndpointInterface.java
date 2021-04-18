package SoapEndPoints;

import java.util.ArrayList;

import com.foot.rest.models.League;
import com.foot.rest.models.Players;
import com.foot.rest.models.Team;

public interface EndpointInterface {
	
	public ArrayList<League>getAllLeagues();
	public League getLeague(String league_code);
	public League createLeague(League league);
	public League updateLeague(String league_code, League league);
	public String deleteLeague(String league_code);
	
	
	public ArrayList<Team> getAllTeams(String league_code);
	public Team getTeamById(int id_team);
	public Team createTeam(Team team, String league_code);
	public Team updateTeam(int id_team, Team team);
	public String deleteTeam(int id_team);
	
	
	public ArrayList<Players> getBestPlayersLeague(String post);
	public Players getBestPlayer(String league_code, String post);
	public Players addPlayer(String league_code, Players player);
	public Players updatePlayer(String league_code, String post, Players player);
	public String deletePlayer(String league_code, String post);
	

}
