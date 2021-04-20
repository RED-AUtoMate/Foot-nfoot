package com.rest.client;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

import com.foot.rest.models.User;

public class ClientRest {
	
	private static String webServiceUrl = "http://localhost:8080/FootnRest/users/signin";

	public static void main(String[] args) {
		
		WebClient webClient = WebClient.create(webServiceUrl);
		
		User u = new User();
		u.setEmail("hhh.hhh");
		u.setFirsName("hhh");
		u.setLastName("hhh");
		u.setPassword("hhh");
		
		Response rs = webClient.post(u);
		
		System.out.println(rs.getStatus());
		

	}
	

}
