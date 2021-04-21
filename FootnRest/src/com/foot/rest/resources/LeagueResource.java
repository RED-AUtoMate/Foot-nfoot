package com.foot.rest.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;

import com.foot.rest.controls.DB;
import com.foot.rest.models.League;
import com.foot.rest.models.Leagues;
import com.foot.rest.models.Players;
import com.foot.rest.models.Playerss;
import com.foot.rest.models.Team;
import com.foot.rest.models.Teams;
import com.foot.rest.services.LeagueService;
import com.foot.rest.services.PlayerService;
import com.foot.rest.services.TeamService;




@Path("/leagues/")
public class LeagueResource {
	
	private LeagueService leagueService = new LeagueService();
	private TeamService teamService = new TeamService();
	private PlayerService playerService = new PlayerService();

	
	
	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllLeagues() {
		ArrayList<League> leagues = leagueService.getAllLeagues();
		Leagues l = new Leagues();
		l.setLgs(leagues);
		if(leagues.size() != 0) {
			return Response.status(Status.OK).
					entity(l)
					.build();
		}
		return Response.status(Status.NOT_FOUND).build();
				
	}
	
	
	@Path("{code}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getLeague(@PathParam("code") String code) {
		
		League l = leagueService.getLeagueByCode(code);
		if(l.getId() != 0) {
			return Response.status(Status.OK)
					.entity(l)
					.build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response createLeague(League league) {
		League l = leagueService.createLeague(league);
		if(l != null) {
			return Response.status(Status.CREATED).entity(l).build();
		}
		return Response.status(Status.NOT_MODIFIED).build();
		
	}
	
	
	@Path("/{code}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response updateLeague(@PathParam("code") String code, League league ){
		League l = leagueService.updateLeague(code,league);
		if(l != null) {
			return Response.status(Status.CREATED).entity(l).build();
		}
		return Response.status(Status.NOT_MODIFIED).build();
		
	}
	
	
	@Path("/{id_league}")
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteLeague(@PathParam("id_league") String id_league ){
		
		
		String s = leagueService.deleteLeague(id_league) ;
		
			return Response.status(Status.OK).entity(s).build();
		
	}
	
	
	
	
	@Path("/{code}/teams")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllTeams(@PathParam("code") String league_code) {
		ArrayList<Team> teams = this.teamService.getAllTeams(league_code);
		Teams tms = new Teams();
		tms.setTeams(teams);
		if(teams.size() > 0) {
			return Response.status(Status.OK)
					.entity(tms)
					.build();
		}
		return Response.status(Status.NOT_FOUND).build();
	}
	
	
	@Path("/{code}/teams/{id_team}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getTeamById(@PathParam("id_team") int id_team ){	
		/*link HATEOS*/
		
		if(teamService.getTeamById(id_team).getId() != 0) {
			Response rs = Response.status(Status.OK)
					.entity(teamService.getTeamById(id_team))
					.build();
			return rs;
		}else 
			
		return Response.status(Status.NOT_FOUND).build();
		
		
	}
	
	@Path("/{code}/teams")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response createTeam(Team team, @PathParam("code") String code) {
		
		
		/*ADD links H HATEOS*/
		Team t = teamService.createTeam(team);
		
		Response rs;
		if(t != null) {
			rs = Response.status(Status.CREATED)
					.entity(t)
					.build();
		}else {
			rs = Response.status(Status.NOT_MODIFIED).build();
		}
		return rs;
		
	}
	
	@Path("/{code}/teams/{id_team}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response updateTeam(@PathParam("id_team") int id_team, Team team) {
		Team t = teamService.updateTeam(id_team,team);
		/*link HATEOS*/
		if(t != null) {
			Response rs = Response.status(Status.CREATED)
					.entity(t)
					.build();
			return rs;
		}
		return Response.status(Status.NOT_MODIFIED).build();
	}
	
	
	@Path("/{code}/teams/{id_team}")
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteTeam(@PathParam("id_team") int id_team) {
		
		
		Response rs = Response.status(Status.OK)
				.entity(teamService.deleteTeame(id_team))
				.build();
		return rs;
	}
	
	
	@Path("/{code}/bestplayers")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getBestPlayersLeague(@PathParam("code") String code) {
		ArrayList<Players> players = playerService.getBestPlayers(code);
		Playerss pls = new Playerss();
		pls.setPlayers(players);
		if(players.size() != 0) {
			
			return Response.status(Status.OK)
					.entity(pls)
					.build();
		}
		
		return Response.status(Status.NOT_FOUND).build();
		
	}
	
	
	@Path("/{code}/bestplayers/{poste}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getBestPlayer(@PathParam("code") String code, @PathParam("poste") String poste) {
		
		Players player = playerService.getBestPlayer(code, poste);
		
		if(player.getID() != 0) {
			return Response.status(Status.OK).entity(player).build();
		}
		
		return Response.status(Status.NOT_FOUND).build();
	}

	
	@Path("/{code}/bestplayers")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response addPlayer(@PathParam("code") String code, Players player) {
		
		Players pla = playerService.addPlayer(player, code);
		
		if(player != null) {
			return Response.status(Status.CREATED).entity(pla).build();
		}
		
		return Response.status(Status.NOT_MODIFIED).build();
	}
	
	
	
	@Path("/{code}/bestplayers/{post}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response updatePlayer(@PathParam("code") String code, @PathParam("post") String poste, Players player) {
		
		Players pl = playerService.updatePlayer(poste, code, player);
		
		if(pl != null) {
			return Response.status(Status.OK).entity(pl).build();
		}
		
		return Response.status(Status.NOT_MODIFIED).build();
	}
	
	
	@Path("/{code}/bestplayers/{post}")
	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	public Response deletePlayer(@PathParam("code") String code, @PathParam("post") String poste) {
		
		String a = playerService.deletePlayerByPostAndLeague(poste, code);
		
			return Response.status(Status.OK).entity(a).build();
		
	}
	


}
