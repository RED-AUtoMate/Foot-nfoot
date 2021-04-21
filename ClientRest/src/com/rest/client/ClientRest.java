package com.rest.client;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.codec.binary.Base64;
import org.apache.cxf.jaxrs.client.WebClient;

import com.foot.rest.models.League;
import com.foot.rest.models.Leagues;
import com.foot.rest.models.Players;
import com.foot.rest.models.Playerss;
import com.foot.rest.models.Team;
import com.foot.rest.models.Teams;
import com.foot.rest.models.User;

public class ClientRest {
	

	public String convertInputStreamToString(InputStream is) throws IOException {

		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte[] buffer = new byte[8192];
		int length;
		while ((length = is.read(buffer)) != -1) {
			result.write(buffer, 0, length);
		}
		return result.toString(StandardCharsets.UTF_8.name());
	}
	


	public User createUser(User user, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/users/signin";
		WebClient webClient = WebClient.create(webServiceUrl);
		Response rs = webClient.post(user);
		System.out.println("Status" + rs.getStatus());	
		try {
			JAXBContext c = JAXBContext.newInstance(User.class);
			Unmarshaller un = c.createUnmarshaller();
			User user1 = (User) un.unmarshal((InputStream) rs.getEntity());
			return user1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public User updateUser(User user, String id, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/users/signin/" + id;
		WebClient webClient = WebClient.create(webServiceUrl);
		Response rs = webClient.put(user);
		System.out.println("Status : "+ rs.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(User.class);
			Unmarshaller un = c.createUnmarshaller();
			User user1 = (User) un.unmarshal((InputStream) rs.getEntity());
			return user1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public String deleteUser(String id, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/users/signin/" + id;
		WebClient webClient = WebClient.create(webServiceUrl);
		Response rs = webClient.delete();
		System.out.println("Status : "+ rs.getStatus());
		  String ss = "";
		try {
			ss = this.convertInputStreamToString((InputStream) rs.getEntity());
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          return ss;
		
	}

	public Leagues getAllLeagues(String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rsp = webClient.get();
		System.out.println("Status : "+ rsp.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(Leagues.class);
			Unmarshaller un = c.createUnmarshaller();
			Leagues listeOfLeague = (Leagues) un.unmarshal((InputStream) rsp.getEntity());
			return listeOfLeague;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public League getLeagueByCode(String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.get();
		System.out.println("Status : "+ rs.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(League.class);
			Unmarshaller un = c.createUnmarshaller();
			League league = (League) un.unmarshal((InputStream) rs.getEntity());
			return league;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public League addLeague(League league, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.post(league);
		System.out.println("Status : "+ rs.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(League.class);
			Unmarshaller un = c.createUnmarshaller();
			League league1 = (League) un.unmarshal((InputStream) rs.getEntity());
			return league1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public League updateLeagueByCode(League league, String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.put(league);
		System.out.println("Status : "+ rs.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(League.class);
			Unmarshaller un = c.createUnmarshaller();
			League league1 = (League) un.unmarshal((InputStream) rs.getEntity());
			return league1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public Playerss getBestPlayersInLeagueByCode(String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode + "/bestplayers";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rsp = webClient.get();
		try {
			JAXBContext c = JAXBContext.newInstance(Playerss.class);
			Unmarshaller un = c.createUnmarshaller();
			Playerss pls =  (Playerss) un.unmarshal((InputStream) rsp.getEntity());
			return pls;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public Players getBestPlayerInLeagueByCodeAndPost(String leagueCode, String poste, String username,
			String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode + "/bestplayers/" + poste;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.get();
		System.out.println("Status : "+ rs.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(Players.class);
			Unmarshaller un = c.createUnmarshaller();
			Players player1 = (Players) un.unmarshal((InputStream) rs.getEntity());
			return player1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public Players updatePlayerbyPostInLeague(Players player, String leagueCode, String post, String username,
			String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode + "/bestplayers/" + post;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.put(player);
		System.out.println("Status : "+ rs.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(Players.class);
			Unmarshaller un = c.createUnmarshaller();
			Players player1 = (Players) un.unmarshal((InputStream) rs.getEntity());
			return player1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public Players createPlayerbyPostInLeague(Players player, String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode + "/bestplayers";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.post(player);
		System.out.println("Status" + rs.getStatus());	
		try {
			JAXBContext c = JAXBContext.newInstance(Players.class);
			Unmarshaller un = c.createUnmarshaller();
			Players player1 = (Players) un.unmarshal((InputStream) rs.getEntity());
			return player1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public String deletePlayerbyPostInLeague(String leagueCode, String post, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode + "/bestplayers/" + post;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.delete();
		System.out.println("Status : "+ rs.getStatus());
		  String ss = "";
		try {
			ss = this.convertInputStreamToString((InputStream) rs.getEntity());
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ss;
		
	}

	public Teams getAllTeamsByLeague(String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + leagueCode + "/teams/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rsp = webClient.get();
		System.out.println("Status : "+ rsp.getStatus());
		try {
			JAXBContext c = JAXBContext.newInstance(Teams.class);
			Unmarshaller un = c.createUnmarshaller();
			Teams tms = (Teams) un.unmarshal((InputStream) rsp.getEntity());
			return tms;
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public Team getTeamById(String teamId, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/PL/teams/" + teamId;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.get();
		System.out.println("Status" + rs.getStatus());	
		try {
			JAXBContext c = JAXBContext.newInstance(Team.class);
			Unmarshaller un = c.createUnmarshaller();
			Team team1 = (Team) un.unmarshal((InputStream) rs.getEntity());
			return team1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public Team createTeamByLeague(Team team, String teamLeague, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + teamLeague + "/teams/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.post(team);
		System.out.println("Status" + rs.getStatus());	
		try {
			JAXBContext c = JAXBContext.newInstance(Team.class);
			Unmarshaller un = c.createUnmarshaller();
			Team team1 = (Team) un.unmarshal((InputStream) rs.getEntity());
			return team1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public Team updateTeamByLeagueAndId(Team team, String teamLeague, String idTeam, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + teamLeague + "/teams/" + idTeam;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.post(team);
		System.out.println("Status" + rs.getStatus());	
		try {
			JAXBContext c = JAXBContext.newInstance(Team.class);
			Unmarshaller un = c.createUnmarshaller();
			Team team1 = (Team) un.unmarshal((InputStream) rs.getEntity());
			return team1;	
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null	;
	}

	public String deleteTeamByLeagueAndId(String teamLeagueCode, String idTeam, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/" + teamLeagueCode + "/teams/" + idTeam;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" + password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic " + st);
		Response rs = webClient.delete();
		System.out.println("Status : "+ rs.getStatus());
		String ss = "";
		try {
			ss = this.convertInputStreamToString((InputStream) rs.getEntity());
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return ss;
		
	}

}