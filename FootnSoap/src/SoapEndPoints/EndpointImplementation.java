package SoapEndPoints;

import java.util.ArrayList;

import com.foot.rest.models.League;
import com.foot.rest.models.Players;
import com.foot.rest.models.Team;

public class EndpointImplementation implements EndpointInterface {


   
   
   public ArrayList<League> getAllLeagues() {
      // TODO Auto-generated method stub
      return null;
   }

   public League getLeague(String league_code) {
      // TODO Auto-generated method stub
      return null;
   }

   public League createLeague(League league) {
      // TODO Auto-generated method stub
      return null;
   }

   public League updateLeague(String league_code, League league) {
      // TODO Auto-generated method stub
      return null;
   }

   public String deleteLeague(String league_code) {
      // TODO Auto-generated method stub
      return null;
   }

   public ArrayList<Team> getAllTeams(String league_code) {
      // TODO Auto-generated method stub
      return null;
   }

   public Team getTeamById(int id_team) {
      // TODO Auto-generated method stub
      return null;
   }

   public Team createTeam(Team team, String league_code) {
      // TODO Auto-generated method stub
      return null;
   }

   public Team updateTeam(int id_team, Team team) {
      // TODO Auto-generated method stub
      return null;
   }

   public String deleteTeam(int id_team) {
      // TODO Auto-generated method stub
      return null;
   }

   public ArrayList<Players> getBestPlayersLeague(String post) {
      // TODO Auto-generated method stub
      return null;
   }

   public Players getBestPlayer(String league_code, String post) {
      // TODO Auto-generated method stub
      return null;
   }

   public Players addPlayer(String league_code, Players player) {
      // TODO Auto-generated method stub
      return null;
   }

   public Players updatePlayer(String league_code, String post, Players player) {
      // TODO Auto-generated method stub
      return null;
   }

   public String deletePlayer(String league_code, String post) {
      // TODO Auto-generated method stub
      return null;
   }


}
