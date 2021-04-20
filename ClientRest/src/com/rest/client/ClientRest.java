package com.rest.client;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.core.Response;

import org.apache.commons.codec.binary.Base64;
import org.apache.cxf.jaxrs.client.WebClient;



import com.foot.rest.models.League;
import com.foot.rest.models.Players;
import com.foot.rest.models.Team;
import com.foot.rest.models.User;

public class ClientRest {
	private static final String UTF_8 = null;
	public static void main(String[] args) {
		
		ClientRest rs = new ClientRest();
//		User u = new User();
//		u.setEmail("11");
//		u.setFirsName("cscq");
//		u.setLastName("vqsvs");
//		u.setPassword("ffsBDs");
//		rs.createUser(u);	
//		rs.updateUser(u, "1");
//		rs.deleteUser("2");		
//		League l = new League();
//		l.setId(12);
//		l.setLeague_code("test");
//		l.setLeague_country("test1");
//		l.setLeague_name("test");
		Players player = new Players();
		player.setAge(44);
		player.setFirstName("edvq");
		player.setID(44);
		player.setLastName("sv q");
		player.setPlayer_league(1);
		player.setPlayer_team(1);
		player.setPost("cscsq");
		player.setScore(33);
//		rs.getLeagueByCode("PL", "0000", "0000");
//		rs.addLeague(l, "0000", "0000");
//		rs.updateLeagueByCode(l, "test", "0000", "0000");
//		rs.getBestPlayersInLeagueByCodeAndPost("FRL1", "Buteur", "0000", "0000");
		rs.getLeagueByCode("PL", "hhh.hhh", "hhh");
		
	}

	

	
	private void createUser(User user, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/users/signin";
		WebClient webClient = WebClient.create(webServiceUrl);
		Response rs = webClient.post(user);
		System.out.println(rs.getStatus());
	}
	
	private void updateUser(User user, String id, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/users/signin/"+id;
		WebClient webClient = WebClient.create(webServiceUrl);
			Response rs = webClient.put(user);
		System.out.println(rs.getStatus());
	}
	
	private void deleteUser(String id, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/users/signin/"+id;
		WebClient webClient = WebClient.create(webServiceUrl);
		Response rs = webClient.delete();
		System.out.println(rs.getStatus());
	}
	
	private void getAllLeagues(String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rsp = webClient.get();
		System.out.println(rsp.getStatus());
	}
	private static String convertInputStreamToString(InputStream is) throws IOException {

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int length;
        while ((length = is.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString(StandardCharsets.UTF_8.name());

	}
	
	private void getLeagueByCode(String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.get();
		try {
			String result = convertInputStreamToString((InputStream) rs.getEntity());
			System.out.println(result);
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(rs.getStatus());
	}
	
	private void addLeague(League league, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.post(league);
		System.out.println(rs.getStatus());	
	}
	
	private void updateLeagueByCode(League league, String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.put(league);
		System.out.println(rs.getStatus());		
	}
	
	private void getBestPlayersInLeagueByCode(String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode+"/bestplayers";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.get();
		System.out.println(rs.getStatus());		
	}
	
	private void getBestPlayersInLeagueByCodeAndPost(String leagueCode, String poste, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode+"/bestplayers/"+poste;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.get();
		System.out.println(rs.getStatus());		
	}
	
	private void updatePlayerbyPostInLeague(Players player, String leagueCode, String poste, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode+"/bestplayers"+poste;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.put(player);	
		System.out.println(rs.getStatus());			
	}
	private void createPlayerbyPostInLeague(Players player, String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode+"/bestplayers";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.post(player);	
		System.out.println(rs.getStatus());			
	}
	
	private void deletePlayerbyPostInLeague(String leagueCode, String poste, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode+"/bestplayers"+poste;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.delete();	
		System.out.println(rs.getStatus());	
	
	
	}
	public void getAllTeamsByLeague(String leagueCode, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+leagueCode+"/teams/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.get();	
		System.out.println(rs.getStatus());		
	}
	
	public void getTeamById(String teamId, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/PL/teams/"+teamId;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.get();	
		System.out.println(rs.getStatus());	
	}
	public void createTeamByLeague(Team team, String teamLeague, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+teamLeague+"/teams/";
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.post(team);	
		System.out.println(rs.getStatus());	
	}
	public void updateTeamByLeagueAndId(Team team, String teamLeague, String idTeam, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+teamLeague+"/teams/"+idTeam;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);	
		Response rs = webClient.post(team);	
		System.out.println(rs.getStatus());	
	}
	public void deleteTeamByLeagueAndId(Team team, String teamLeague, String idTeam, String username, String password) {
		String webServiceUrl = "http://localhost:8080/FootnRest/api/leagues/"+teamLeague+"/teams/"+idTeam;
		WebClient webClient = WebClient.create(webServiceUrl);
		String s = username + ":" +password;
		byte[] byteArray = Base64.encodeBase64(s.getBytes());
		String st = new String(byteArray);
		webClient.header("Authorization", "Basic "+ st);		
		Response rs = webClient.delete();	
		System.out.println(rs.getStatus());	
	}	
	
	}
