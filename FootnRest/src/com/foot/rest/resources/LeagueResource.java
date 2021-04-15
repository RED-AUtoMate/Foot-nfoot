package com.foot.rest.resources;

<<<<<<< HEAD

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
=======
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
>>>>>>> origin/main

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
	

	@Path("{code}")
	@GET
	public Response getLeague(@PathParam("code") String code) {
		
		return Response.status(Status.OK).build();
		
	}
	
	
	
	
	

	private LeagueService leagueService = new LeagueService();
	
public void initConnexion() {
		
		String url = "jdbc:mysql://localhost::3306/ws2";
		String user = "root";
		String password = "";
		try {
			System.out.println("avant");
			Class.forName("com.mysql.jdb.Driver");
			System.out.println("pendant");
			Connection connexion = DriverManager.getConnection(url, user, password);
			System.out.println("apres");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	@Path("/{id_league}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public String getLeagueById(@PathParam("id_league") String id_league ){
		System.out.println("test");
		initConnexion();
//		return leagueService.getLeagueById(id_league);
		return "reussite";
	}
	
	@Path("/")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	public void createLeague(League league) {
		leagueService.createLeague(league);
	}
	
	@Path("/{id_league}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	public void updateLeague(@PathParam("id_league") String id_league, League league ){
		leagueService.updateLeague(id_league,league);
	}
	
	@Path("/{id_league}")
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	public void deleteLeague(@PathParam("id_league") String id_league ){
		leagueService.deleteLeague(id_league);
	}


}
