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

import com.foot.rest.models.League;
import com.foot.rest.services.LeagueService;



@Path("/leagues")
public class LeagueResource {
	
	private LeagueService leagueService = new LeagueService();
	
	@Path("/{id_league}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public League getLeagueById(@PathParam("id_league") String id_league ){
		
		return leagueService.getLeagueById(id_league);
	}
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void createLeague(League league) {
		leagueService.createLeague(league);
	}
	
	@Path("/{id_league}")
	@PUT
	@Produces(MediaType.APPLICATION_XML)
	public void updateLeague(@PathParam("id_league") String id_league, League league ){
		leagueService.updateLeague(id_league,league);
	}
	
	@Path("/{id_league}")
	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	public void deleteLeague(@PathParam("id_league") String id_league ){
		leagueService.deleteLeague(id_league);
	}

}
