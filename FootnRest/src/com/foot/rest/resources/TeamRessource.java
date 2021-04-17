package com.foot.rest.resources;

import java.util.ArrayList;

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
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.foot.rest.models.League;
import com.foot.rest.models.Team;
import com.foot.rest.services.TeamService;

@Path("/leagues/{code}")
public class TeamRessource {

	
	private TeamService teamService = new TeamService();
	
	
	@Path("/teams")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllTeams(@PathParam("code") String league_code) {
		ArrayList<Team> teams = this.teamService.getAllTeams(league_code); 
		return Response.status(Status.OK)
				.entity(new GenericEntity<ArrayList<Team>>(teams) {})
				.build();
	}
	
	@Path("/teams/{id_team}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getTeamById(@PathParam("id_team") int id_team ){	
		/*link HATEOS*/
		
		if(teamService.getTeamById(id_team) != null) {
			Response rs = Response.status(Status.OK)
					.entity(teamService.getTeamById(id_team))
					.build();
			return rs;
		}else 
			
		return Response.status(Status.NOT_FOUND).build();
		
		
	}
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response createTeam(Team team) {
		
		
		/*ADD links H HATEOS*/
		Team t = teamService.createTeam(team);
		
		Response rs = Response.status(Status.CREATED)
				.entity(t)
				.build();
		return rs;
		
		
		
	}
	
	@Path("/{id_team}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public Response updateTeam(@PathParam("id_team") int id_team, Team team) {
		Team t = teamService.updateTeam(id_team,team);
		/*link HATEOS*/
		Response rs = Response.status(Status.CREATED)
				.entity(t)
				.build();
		return rs;
	}
	
	@Path("/{id_team}")
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteTeam(@PathParam("id_team") int id_team) {
		
		
		Response rs = Response.status(Status.OK)
				.entity(teamService.deleteTeame(id_team))
				.build();
		return rs;
	}
	
	
}
