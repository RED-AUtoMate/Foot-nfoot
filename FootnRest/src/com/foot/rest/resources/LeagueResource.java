package com.foot.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;



@Path("/leagues")
public class LeagueResource {
	
	@Path("{code}")
	@GET
	public Response getLeague(@PathParam("code") String code) {
		
		return Response.status(Status.OK).build();
		
	}
	
	
	
	
	

}
