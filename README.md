# FootnFoot Read-Me
### The Projet
This project was created by the Group Redd for the Licence3 course Web Services at  CY Cergy Paris University 
### Redd members
HOUARI Mourtada
HADDADI Rayane
KASMI Ghilas
### The Service
FootnFoot is a service which handle data around major football championships and professionnal leagues, it allows to add/ get/ modify/ delete different entities in the service's database. the available data in the actual version(v1.0) are :  
* League : /leagues : 
    GET /{id_league} : get the league the the id "id_league"
    POST / : create a league with an object passed in parameters
    PUT /{id_league} : Update the league with id "id_league" with the league object passed in parameter
    DELETE /{id_league} : delete the league with the id "id_league"
* Team : /league/{id_league}/teams
    GET /{id_team} : get the team the the id "id_team"
    POST / : create a league with a Team object passed in parameters
    PUT /{id_team} : Update the team with id "id_team" with the team object passed in parameter
    DELETE /{id_team} : delete the team with the id "id_team"
* Player : /league/{id_league}/team/{id_team}/players
    GET /{id_league} : get the Player the the id "id_Player"
    POST / : create a Player with an object passed in parameters
    PUT /{id_player} : Update the Player with id "id_Player" with the Player object passed in parameter
    DELETE /{id_player} : delete the Player with the id "id_Player"
* User : /users
    GET /{id_User} : get the User the the id "id_User"
    POST / : create a User with an object passed in parameters
    PUT /{id_User} : Update the User with id "id_User" with the User object passed in parameter
    DELETE /{id_User} : delete the User with the id "id_User"
### The database
the relation between our entities is simple : a league contains multiples teams, and a team may contains multiple players.
User is an isolated entity, we use it for authentification to handle the access rights.
<img src="https://github.com/RED-AUtoMate/Foot-nfoot/blob/b700c8f89b5c77fead867256906850e500cfe15e/MCD.png">
