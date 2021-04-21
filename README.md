# FootnFoot Read-Me
### The Projet
This project was created by the Group Redd for the Licence3 course Web Services at  CY Cergy Paris University 
### Redd members
HOUARI Mourtada : imadhou00@gmail.com <br/>
HADDADI Rayane : rayanhaddadi1@gmail.com <br/>
KASMI Ghilas : kasmi.ghilas@yahoo.com <br/>
### The Service
FootnFoot is a service which handle data around major football championships and professionnal leagues, it allows to add/ get/ modify/ delete different entities in the service's database. the available data in the actual version(v1.0) are :  
* League : /leagues : 
    GET /{id_league} : get the league the the id "id_league" <br/>
    POST / : create a league with an object passed in parameters <br/>
    PUT /{id_league} : Update the league with id "id_league" with the league object passed in parameter <br/>
    DELETE /{id_league} : delete the league with the id "id_league"
* Team : /league/{id_league}/teams
    GET /{id_team} : get the team the the id "id_team" <br/>
    POST / : create a league with a Team object passed in parameters <br/>
    PUT /{id_team} : Update the team with id "id_team" with the team object passed in parameter <br/>
    DELETE /{id_team} : delete the team with the id "id_team"
* Player : /league/{id_league}/team/{id_team}/players
    GET /{id_league} : get the Player the the id "id_Player" <br/>
    POST / : create a Player with an object passed in parameters <br/>
    PUT /{id_player} : Update the Player with id "id_Player" with the Player object passed in parameter <br/>
    DELETE /{id_player} : delete the Player with the id "id_Player"
* User : /auth
    POST / : create a User with an object passed in parameters <br/>
    PUT /{id_User} : Update the User with id "id_User" with the User object passed in parameter <br/>
    DELETE /{id_User} : delete the User with the id "id_User" 

### Authentification

This project contains two servelets, the first one is containing th user related operations, this one works without any authentifications, it's the public part of the service, but the second one is more private : it is necessary to register to get the access to the data. The authentification used is a basic authentification, every request to the second servelet need to be filled with a valid username and password ( contained in the db)

### Functions
*   User createUser(User user) : create a user in the db
*   User updateUser(User user) : update user informations in the db
*   String deleteUser(String id) : delete the user with the id "id" from the db
*   Leagues getAllLeagues(String username, String password) : return all the leagues registered in the db
*   League getLeagueByCode(String leagueCode, String username, String password) : return the league with id "code" in the db
*   League addLeague(League league, String username, String password) : create a League in the db
*   League updateLeagueByCode(League league, String leagueCode, String username, String password) : update the League with the id "leagueCode"  in the db
*   Playerss getBestPlayersInLeagueByCode(String leagueCode, String username, String password) : get the best player in the league with the id "leagueCode" 
*   Players getBestPlayerInLeagueByCodeAndPost(String leagueCode, String poste, String username, String password) :get the best player at a specific position "poste" in the league with the id "leagueCode" 
*   Players updatePlayerbyPostInLeague(Players player, String leagueCode, String post, String username, String password) : update player at a specific position "post" in the league with the id "leagueCode" 
*   Players createPlayerbyPostInLeague(Players player, String leagueCode, String username, String password) : create a player at a specific position "post" in the league with the id "leagueCode" 
*   String deletePlayerbyPostInLeague(String leagueCode, String post, String username, String password) delete  player at a specific position "post" in the league with the id "leagueCode" 
*   Teams getAllTeamsByLeague(String leagueCode, String username, String password) : get all teams in the league with the id "leagueCode"
*   Team getTeamById(String teamId, String username, String password) : get the team with the id 'teamId'
*   Team createTeamByLeague(Team team, String teamLeague, String username, String password) : create team in the db
*   Team updateTeamByLeagueAndId(Team team, String teamLeague, String idTeam, String username, String password) : update team with the id 'idTeam' in a specific League "teamLeague"
*   String deleteTeamByLeagueAndId(String teamLeagueCode, String idTeam, String username, String password) : delete team with the id 'idTeam' in a specific League "teamLeague"
*   String convertInputStreamToString(InputStream is) : convert the entity in the response to an xml string and return it
PS1 : the parameters username and password are used for authentification, without them the request won't work
PS2 : except "convertInputStreamToString", all the other functions follows 4 categories ( add, update, delete, get) but add update and get act similarely <br/>
    * add/update/get : the functions adding/updating/getting a ressource returns the ressource itself ( an object ) if added/updated/got correctly, otherwise it returns null
    * delete : the function deleting a ressource return an String containing an xml message if the ressource was deleted successfully, else it return an empty String

### The database
the relation between our entities is simple : a league contains multiples teams, and a team may contains multiple players.
User is an isolated entity, we use it for authentification to handle the access rights.
<img src="https://github.com/RED-AUtoMate/Foot-nfoot/blob/b700c8f89b5c77fead867256906850e500cfe15e/MCD.png">
