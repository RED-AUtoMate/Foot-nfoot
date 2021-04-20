package com.foot.rest.services;


import java.io.IOException;
import java.util.List;
import java.util.StringTokenizer;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.apache.tomcat.util.codec.binary.Base64;

import com.foot.rest.models.User;

@Provider
public class AuthenticateFilter implements ContainerRequestFilter {

	

	private static final String AUTHORIZATION_HEADER = "Authorization";
	private static final String AUTHORIZATION_HEADER_PREFIX = "Basic";
	UserService userService = new UserService();
	
	
	
	@Override
	public void filter(ContainerRequestContext arg0) throws IOException {
		
		
		System.out.println(arg0.getHeaders());
		if(arg0.getHeaders().containsKey(AUTHORIZATION_HEADER)) {
			List<String> authHeader = arg0.getHeaders().get(AUTHORIZATION_HEADER);
			if(authHeader.size()>0) {
				String authToken = authHeader.get(0);
				System.out.println("hhhhhh "+authToken);
				authToken=authToken.replaceFirst(AUTHORIZATION_HEADER_PREFIX, ""); 
				byte[] byteArray = Base64.decodeBase64(authToken.getBytes()); 
				String decodedString = new String(byteArray);
				System.out.println("dec "+decodedString);
				StringTokenizer tokenizer = new StringTokenizer(decodedString,":");
				String username = tokenizer.nextToken();
				String password = tokenizer.nextToken();
				System.out.println(username+" "+password);
				User usr = userService.select(username);
				if (usr != null && usr.getEmail().equals(username) && usr.getPassword().equals(password)) {
					return;    
				}  
				Response unauthorisedStatus = Response 
						.status(Response.Status.UNAUTHORIZED) 
						.entity("User cannot access the resource") 
						.build();
				arg0.abortWith(unauthorisedStatus);
				return;
			}
			
			
		}
		Response unauthorisedStatus = Response 
				.status(Response.Status.BAD_REQUEST) 
				.entity("Authentication is required") 
				.build();
		arg0.abortWith(unauthorisedStatus);
		
	}
	
	
	
	
}
