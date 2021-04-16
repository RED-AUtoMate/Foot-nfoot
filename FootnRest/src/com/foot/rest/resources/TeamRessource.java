package com.foot.rest.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.foot.rest.models.Teame;
import com.foot.rest.services.TeamService;

@Path("/league/{id}/teams")
public class TeamRessource {

	
	private TeamService teamService = new TeamService();
	
	@Path("/{id_team}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Teame getTeamById(@PathParam("id_team") int id_team ){
		
		
		return teamService.getTeamById(id_team);
		
	}
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void createTeam(Teame team) {
		teamService.createTeam(team);
		
	}
	
	@Path("/{id_team}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void updateTeam(@PathParam("id_team") int id_team, Teame team) {
		teamService.updateTeam(id_team,team);
	}
	
	@Path("/{id_team}")
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	public void deleteTeam(@PathParam("id_team") String id_team) {
		teamService.deleteTeame(id_team);
	}
	
	
}
