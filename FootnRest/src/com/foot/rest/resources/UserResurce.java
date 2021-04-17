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
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.foot.rest.models.User;
import com.foot.rest.services.UserService;

@Path("/signin")
public class UserResurce {
	UserService userService = new UserService();


    @Path("/")
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Response addUser(User user) {
    	
    	User user1 = userService.insert(user);
    	Response rs = Response.status(Status.CREATED).entity(user1).build();
    	return rs;
    }

    @Path("/{id_user}")
    @PUT
    @Consumes(MediaType.APPLICATION_XML)
    public Response updateUser(@PathParam("id_user") int id_user, User user) {
        
    	
    	
    	User us = userService.updateUser(id_user,user);
        Response rs = Response.status(Status.CREATED)
                .entity(us)
                .build();
        return rs;
    }

    @Path("/{id_user}")
    @DELETE
    @Consumes(MediaType.APPLICATION_XML)
    public Response deleteUser(@PathParam("id_user") int id_user) {


        Response rs = Response.status(Status.OK)
                .entity(userService.deleteUser(id_user))
                .build();
        return rs;
    }

}