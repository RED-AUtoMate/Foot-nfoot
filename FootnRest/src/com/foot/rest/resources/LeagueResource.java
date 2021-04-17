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
import com.foot.rest.services.LeagueService;




@Path("/leagues")
public class LeagueResource {
	
	private LeagueService leagueService = new LeagueService();
	
	
	@Path("/")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getAllLeagues() {
		ArrayList<League> leagues = leagueService.getAllLeagues();
		return Response.status(Status.OK).
				entity(new GenericEntity<ArrayList<League>>(leagues) {})
				.build();		
	}
	
	
	@Path("{code}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Response getLeague(@PathParam("code") String code) {
		
		League l = leagueService.getLeagueByCode(code);
		return Response.status(Status.OK)
				.entity(l)
				.build();
	}
	
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response createLeague(League league) {
		League l = leagueService.createLeague(league);
		return Response.status(Status.CREATED).entity(l).build();
	}
	
	
	@Path("/{code}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Response updateLeague(@PathParam("code") String code, League league ){
		League l = leagueService.updateLeague(code,league);
		return Response.status(Status.OK).entity(l).build();
		
	}
	
	
	@Path("/{id_league}")
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	public Response deleteLeague(@PathParam("id_league") String id_league ){
		
		
		if(leagueService.deleteLeague(id_league) == 0) {
			return Response.status(Status.OK).build();
		}
		return Response.status(Status.NOT_MODIFIED).build();
	}


}
