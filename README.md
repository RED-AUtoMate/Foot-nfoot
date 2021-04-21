# FootnFoot Read-Me
### The Projet
This project was created by the Group Redd for the Licence3 course Web Services at  CY Cergy Paris University.
### Redd members
HOUARI Mourtada<br>
HADDADI Rayane<br>
KASMI Ghilas
### The Service
FootnFoot is a service which handle data around major football championships and professionnal leagues, it allows to add/ get/ modify/ delete different entities in the service's database. the available data in the actual version(v1.0) are :  
* League : /leagues :<br>
    GET /{id_league} : get the league the the id "id_league"<br>
    POST / : create a league with an object passed in parameters<br>
    PUT /{id_league} : Update the league with id "id_league" with the league object passed in parameter<br>
    DELETE /{id_league} : delete the league with the id "id_league"<br>
* Team : /league/{id_league}/teams<br>
    GET /{id_team} : get the team the the id "id_team"<br>
    POST / : create a league with a Team object passed in parameters<br>
    PUT /{id_team} : Update the team with id "id_team" with the team object passed in parameter<br>
    DELETE /{id_team} : delete the team with the id "id_team"<br>
* Player : /league/{id_league}/team/{id_team}/players<br>
    GET /{id_league} : get the Player the the id "id_Player"<br>
    POST / : create a Player with an object passed in parameters<br>
    PUT /{id_player} : Update the Player with id "id_Player" with the Player object passed in parameter<br>
    DELETE /{id_player} : delete the Player with the id "id_Player"
* User : /users
    GET /{id_User} : get the User the the id "id_User"<br>
    POST / : create a User with an object passed in parameters<br>
    PUT /{id_User} : Update the User with id "id_User" with the User object passed in parameter<br>
    DELETE /{id_User} : delete the User with the id "id_User"<br>
### The database
The relation between our entities is simple : a league contains multiples teams, and a team may contains multiple players.<br>
User is an isolated entity, we use it for authentification to handle the access rights.<br>
<img src="https://github.com/RED-AUtoMate/Foot-nfoot/blob/b700c8f89b5c77fead867256906850e500cfe15e/MCD.png">
