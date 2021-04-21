package com.rest.client;

import com.foot.rest.models.Playerss;
import com.foot.rest.models.Teams;

public class Main {
	
	public static void main(String[] args) {


		ClientRest rs = new ClientRest();
		
		
		Teams tms = rs.getAllTeamsByLeague("PL", "0000", "0000");
		System.out.println(tms.getTeams().size());
		
	}

}
