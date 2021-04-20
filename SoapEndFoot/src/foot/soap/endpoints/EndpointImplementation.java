package foot.soap.endpoints;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import foot.soap.models.League;
import foot.soap.models.Players;
import foot.soap.models.Team;
import foot.soap.services.LeagueService;
import foot.soap.services.PlayerService;
import foot.soap.services.TeamService;

@WebService(targetNamespace = "http://endpoints.soap.foot/", portName = "EndpointImplementationPort", serviceName = "EndpointImplementationService")
public class EndpointImplementation {

	private LeagueService leagueService = new LeagueService();
	private TeamService teamService = new TeamService();
	private PlayerService playerService = new PlayerService();
   

@WebMethod(operationName = "getAllLeagues", action = "urn:GetAllLeagues")
@WebResult(name = "return")
public ArrayList<League> getAllLeagues() {
	System.out.println("hhhhhh");
	ArrayList<League> lgs = leagueService.getAllLeagues();
	if(lgs != null) {
		return lgs;
	}
	   return null;
   }


@WebMethod(operationName = "getLeague", action = "urn:GetLeague")
@WebResult(name = "return")
public League getLeague( @WebParam(name = "arg0") String league_code) {
      
      return leagueService.getLeagueByCode(league_code);
   }

@WebMethod(operationName = "createLeague", action = "urn:CreateLeague")
@WebResult(name = "return")
public League createLeague( @WebParam(name = "arg0") League league) {
      
      return leagueService.createLeague(league);
   }


@WebMethod(operationName = "updateLeague", action = "urn:UpdateLeague")
@WebResult(name = "return")
public League updateLeague( @WebParam(name = "arg0") String league_code,  @WebParam(name = "arg1") League league) {
	   
      return leagueService.updateLeague(league_code, league);
   }

@WebMethod(operationName = "deleteLeague", action = "urn:DeleteLeague")
@WebResult(name = "return")
public String deleteLeague(@WebParam(name = "arg0") String league_code) {
      
      return leagueService.deleteLeague(league_code) == 0 ? "Teame deleted"  : "Not deleted";
   }

@WebMethod(operationName = "getAllTeams", action = "urn:GetAllTeams")
@WebResult(name = "return")
public ArrayList<Team> getAllTeams( @WebParam(name = "arg0") String league_code) {
      

      return teamService.getAllTeams(league_code);
   }

@WebMethod(operationName = "getTeamById", action = "urn:GetTeamById")
@WebResult(name = "return")
public Team getTeamById( @WebParam(name = "arg0") int id_team) {
	   
      return teamService.getTeamById(id_team);
   }

@WebMethod(operationName = "createTeam", action = "urn:CreateTeam")
@WebResult(name = "return")
public Team createTeam( @WebParam(name = "arg0") Team team,  @WebParam(name = "arg1") String league_code) {
	   
      return teamService.createTeam(team);
   }

@WebMethod(operationName = "updateTeam", action = "urn:UpdateTeam")
@WebResult(name = "return")
public Team updateTeam( @WebParam(name = "arg0") int id_team,  @WebParam(name = "arg1") Team team) {
	   
      return teamService.updateTeam(id_team, team);
   }

@WebMethod(operationName = "deleteTeam", action = "urn:DeleteTeam")
@WebResult(name = "return")
public String deleteTeam( @WebParam(name = "arg0") int id_team) {
      
	      return teamService.deleteTeame(id_team);
   }

@WebMethod(operationName = "getBestPlayersLeague", action = "urn:GetBestPlayersLeague")
@WebResult(name = "return")
public ArrayList<Players> getBestPlayersLeague( @WebParam(name = "arg0") String league_code) {
	   
      return playerService.getBestPlayers(league_code);
   }

@WebMethod(operationName = "getBestPlayer", action = "urn:GetBestPlayer")
@WebResult(name = "return")
public Players getBestPlayer( @WebParam(name = "arg0") String league_code,  @WebParam(name = "arg1") String post) {

	   return playerService.getBestPlayer(league_code, post);
   }

@WebMethod(operationName = "addPlayer", action = "urn:AddPlayer")
@WebResult(name = "return")
public Players addPlayer( @WebParam(name = "arg0") String league_code, @WebParam(name = "arg1") Players player) {

	   return playerService.addPlayer(player, league_code);
   }

@WebMethod(operationName = "updatePlayer", action = "urn:UpdatePlayer")
@WebResult(name = "return")
public Players updatePlayer(@WebParam(name = "arg0") String league_code, @WebParam(name = "arg1") String post,  @WebParam(name = "arg2") Players player) {
	   
	
	   return playerService.updatePlayer(post, league_code, player);
   }

@WebMethod(operationName = "deletePlayer", action = "urn:DeletePlayer")
@WebResult(name = "return")
public String deletePlayer( @WebParam(name = "arg0") String league_code,@WebParam(name = "arg1") String post) {
	   
      return playerService.deletePlayerByPostAndLeague(post, league_code) == 0 ? "Player deleted": "Player not deleted";
   }
}
