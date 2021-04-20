
package foot.soap.endpoints;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the foot.soap.endpoints package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Team_QNAME = new QName("http://endpoints.soap.foot/", "team");
    private final static QName _GetAllTeams_QNAME = new QName("http://endpoints.soap.foot/", "getAllTeams");
    private final static QName _UpdatePlayerResponse_QNAME = new QName("http://endpoints.soap.foot/", "updatePlayerResponse");
    private final static QName _GetAllTeamsResponse_QNAME = new QName("http://endpoints.soap.foot/", "getAllTeamsResponse");
    private final static QName _DeletePlayerResponse_QNAME = new QName("http://endpoints.soap.foot/", "deletePlayerResponse");
    private final static QName _GetBestPlayer_QNAME = new QName("http://endpoints.soap.foot/", "getBestPlayer");
    private final static QName _CreateTeamResponse_QNAME = new QName("http://endpoints.soap.foot/", "createTeamResponse");
    private final static QName _League_QNAME = new QName("http://endpoints.soap.foot/", "league");
    private final static QName _Players_QNAME = new QName("http://endpoints.soap.foot/", "players");
    private final static QName _CreateLeagueResponse_QNAME = new QName("http://endpoints.soap.foot/", "createLeagueResponse");
    private final static QName _CreateTeam_QNAME = new QName("http://endpoints.soap.foot/", "createTeam");
    private final static QName _GetLeague_QNAME = new QName("http://endpoints.soap.foot/", "getLeague");
    private final static QName _UpdateLeagueResponse_QNAME = new QName("http://endpoints.soap.foot/", "updateLeagueResponse");
    private final static QName _UpdateLeague_QNAME = new QName("http://endpoints.soap.foot/", "updateLeague");
    private final static QName _GetBestPlayersLeague_QNAME = new QName("http://endpoints.soap.foot/", "getBestPlayersLeague");
    private final static QName _UpdateTeamResponse_QNAME = new QName("http://endpoints.soap.foot/", "updateTeamResponse");
    private final static QName _DeleteLeagueResponse_QNAME = new QName("http://endpoints.soap.foot/", "deleteLeagueResponse");
    private final static QName _GetAllLeaguesResponse_QNAME = new QName("http://endpoints.soap.foot/", "getAllLeaguesResponse");
    private final static QName _DeletePlayer_QNAME = new QName("http://endpoints.soap.foot/", "deletePlayer");
    private final static QName _CreateLeague_QNAME = new QName("http://endpoints.soap.foot/", "createLeague");
    private final static QName _GetLeagueResponse_QNAME = new QName("http://endpoints.soap.foot/", "getLeagueResponse");
    private final static QName _GetBestPlayersLeagueResponse_QNAME = new QName("http://endpoints.soap.foot/", "getBestPlayersLeagueResponse");
    private final static QName _AddPlayerResponse_QNAME = new QName("http://endpoints.soap.foot/", "addPlayerResponse");
    private final static QName _DeleteTeam_QNAME = new QName("http://endpoints.soap.foot/", "deleteTeam");
    private final static QName _UpdateTeam_QNAME = new QName("http://endpoints.soap.foot/", "updateTeam");
    private final static QName _GetTeamById_QNAME = new QName("http://endpoints.soap.foot/", "getTeamById");
    private final static QName _DeleteLeague_QNAME = new QName("http://endpoints.soap.foot/", "deleteLeague");
    private final static QName _GetTeamByIdResponse_QNAME = new QName("http://endpoints.soap.foot/", "getTeamByIdResponse");
    private final static QName _GetBestPlayerResponse_QNAME = new QName("http://endpoints.soap.foot/", "getBestPlayerResponse");
    private final static QName _DeleteTeamResponse_QNAME = new QName("http://endpoints.soap.foot/", "deleteTeamResponse");
    private final static QName _GetAllLeagues_QNAME = new QName("http://endpoints.soap.foot/", "getAllLeagues");
    private final static QName _AddPlayer_QNAME = new QName("http://endpoints.soap.foot/", "addPlayer");
    private final static QName _UpdatePlayer_QNAME = new QName("http://endpoints.soap.foot/", "updatePlayer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: foot.soap.endpoints
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeleteTeam }
     * 
     */
    public DeleteTeam createDeleteTeam() {
        return new DeleteTeam();
    }

    /**
     * Create an instance of {@link GetBestPlayersLeagueResponse }
     * 
     */
    public GetBestPlayersLeagueResponse createGetBestPlayersLeagueResponse() {
        return new GetBestPlayersLeagueResponse();
    }

    /**
     * Create an instance of {@link GetLeagueResponse }
     * 
     */
    public GetLeagueResponse createGetLeagueResponse() {
        return new GetLeagueResponse();
    }

    /**
     * Create an instance of {@link AddPlayerResponse }
     * 
     */
    public AddPlayerResponse createAddPlayerResponse() {
        return new AddPlayerResponse();
    }

    /**
     * Create an instance of {@link DeleteTeamResponse }
     * 
     */
    public DeleteTeamResponse createDeleteTeamResponse() {
        return new DeleteTeamResponse();
    }

    /**
     * Create an instance of {@link GetBestPlayerResponse }
     * 
     */
    public GetBestPlayerResponse createGetBestPlayerResponse() {
        return new GetBestPlayerResponse();
    }

    /**
     * Create an instance of {@link AddPlayer }
     * 
     */
    public AddPlayer createAddPlayer() {
        return new AddPlayer();
    }

    /**
     * Create an instance of {@link UpdatePlayer }
     * 
     */
    public UpdatePlayer createUpdatePlayer() {
        return new UpdatePlayer();
    }

    /**
     * Create an instance of {@link GetAllLeagues }
     * 
     */
    public GetAllLeagues createGetAllLeagues() {
        return new GetAllLeagues();
    }

    /**
     * Create an instance of {@link GetTeamById }
     * 
     */
    public GetTeamById createGetTeamById() {
        return new GetTeamById();
    }

    /**
     * Create an instance of {@link UpdateTeam }
     * 
     */
    public UpdateTeam createUpdateTeam() {
        return new UpdateTeam();
    }

    /**
     * Create an instance of {@link GetTeamByIdResponse }
     * 
     */
    public GetTeamByIdResponse createGetTeamByIdResponse() {
        return new GetTeamByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteLeague }
     * 
     */
    public DeleteLeague createDeleteLeague() {
        return new DeleteLeague();
    }

    /**
     * Create an instance of {@link GetBestPlayer }
     * 
     */
    public GetBestPlayer createGetBestPlayer() {
        return new GetBestPlayer();
    }

    /**
     * Create an instance of {@link DeletePlayerResponse }
     * 
     */
    public DeletePlayerResponse createDeletePlayerResponse() {
        return new DeletePlayerResponse();
    }

    /**
     * Create an instance of {@link GetAllTeamsResponse }
     * 
     */
    public GetAllTeamsResponse createGetAllTeamsResponse() {
        return new GetAllTeamsResponse();
    }

    /**
     * Create an instance of {@link CreateLeagueResponse }
     * 
     */
    public CreateLeagueResponse createCreateLeagueResponse() {
        return new CreateLeagueResponse();
    }

    /**
     * Create an instance of {@link CreateTeam }
     * 
     */
    public CreateTeam createCreateTeam() {
        return new CreateTeam();
    }

    /**
     * Create an instance of {@link Players }
     * 
     */
    public Players createPlayers() {
        return new Players();
    }

    /**
     * Create an instance of {@link CreateTeamResponse }
     * 
     */
    public CreateTeamResponse createCreateTeamResponse() {
        return new CreateTeamResponse();
    }

    /**
     * Create an instance of {@link League }
     * 
     */
    public League createLeague() {
        return new League();
    }

    /**
     * Create an instance of {@link Team }
     * 
     */
    public Team createTeam() {
        return new Team();
    }

    /**
     * Create an instance of {@link GetAllTeams }
     * 
     */
    public GetAllTeams createGetAllTeams() {
        return new GetAllTeams();
    }

    /**
     * Create an instance of {@link UpdatePlayerResponse }
     * 
     */
    public UpdatePlayerResponse createUpdatePlayerResponse() {
        return new UpdatePlayerResponse();
    }

    /**
     * Create an instance of {@link GetAllLeaguesResponse }
     * 
     */
    public GetAllLeaguesResponse createGetAllLeaguesResponse() {
        return new GetAllLeaguesResponse();
    }

    /**
     * Create an instance of {@link DeleteLeagueResponse }
     * 
     */
    public DeleteLeagueResponse createDeleteLeagueResponse() {
        return new DeleteLeagueResponse();
    }

    /**
     * Create an instance of {@link CreateLeague }
     * 
     */
    public CreateLeague createCreateLeague() {
        return new CreateLeague();
    }

    /**
     * Create an instance of {@link DeletePlayer }
     * 
     */
    public DeletePlayer createDeletePlayer() {
        return new DeletePlayer();
    }

    /**
     * Create an instance of {@link GetLeague }
     * 
     */
    public GetLeague createGetLeague() {
        return new GetLeague();
    }

    /**
     * Create an instance of {@link UpdateLeagueResponse }
     * 
     */
    public UpdateLeagueResponse createUpdateLeagueResponse() {
        return new UpdateLeagueResponse();
    }

    /**
     * Create an instance of {@link GetBestPlayersLeague }
     * 
     */
    public GetBestPlayersLeague createGetBestPlayersLeague() {
        return new GetBestPlayersLeague();
    }

    /**
     * Create an instance of {@link UpdateTeamResponse }
     * 
     */
    public UpdateTeamResponse createUpdateTeamResponse() {
        return new UpdateTeamResponse();
    }

    /**
     * Create an instance of {@link UpdateLeague }
     * 
     */
    public UpdateLeague createUpdateLeague() {
        return new UpdateLeague();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Team }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "team")
    public JAXBElement<Team> createTeam(Team value) {
        return new JAXBElement<Team>(_Team_QNAME, Team.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTeams }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getAllTeams")
    public JAXBElement<GetAllTeams> createGetAllTeams(GetAllTeams value) {
        return new JAXBElement<GetAllTeams>(_GetAllTeams_QNAME, GetAllTeams.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "updatePlayerResponse")
    public JAXBElement<UpdatePlayerResponse> createUpdatePlayerResponse(UpdatePlayerResponse value) {
        return new JAXBElement<UpdatePlayerResponse>(_UpdatePlayerResponse_QNAME, UpdatePlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllTeamsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getAllTeamsResponse")
    public JAXBElement<GetAllTeamsResponse> createGetAllTeamsResponse(GetAllTeamsResponse value) {
        return new JAXBElement<GetAllTeamsResponse>(_GetAllTeamsResponse_QNAME, GetAllTeamsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "deletePlayerResponse")
    public JAXBElement<DeletePlayerResponse> createDeletePlayerResponse(DeletePlayerResponse value) {
        return new JAXBElement<DeletePlayerResponse>(_DeletePlayerResponse_QNAME, DeletePlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getBestPlayer")
    public JAXBElement<GetBestPlayer> createGetBestPlayer(GetBestPlayer value) {
        return new JAXBElement<GetBestPlayer>(_GetBestPlayer_QNAME, GetBestPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTeamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "createTeamResponse")
    public JAXBElement<CreateTeamResponse> createCreateTeamResponse(CreateTeamResponse value) {
        return new JAXBElement<CreateTeamResponse>(_CreateTeamResponse_QNAME, CreateTeamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link League }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "league")
    public JAXBElement<League> createLeague(League value) {
        return new JAXBElement<League>(_League_QNAME, League.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Players }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "players")
    public JAXBElement<Players> createPlayers(Players value) {
        return new JAXBElement<Players>(_Players_QNAME, Players.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLeagueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "createLeagueResponse")
    public JAXBElement<CreateLeagueResponse> createCreateLeagueResponse(CreateLeagueResponse value) {
        return new JAXBElement<CreateLeagueResponse>(_CreateLeagueResponse_QNAME, CreateLeagueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "createTeam")
    public JAXBElement<CreateTeam> createCreateTeam(CreateTeam value) {
        return new JAXBElement<CreateTeam>(_CreateTeam_QNAME, CreateTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLeague }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getLeague")
    public JAXBElement<GetLeague> createGetLeague(GetLeague value) {
        return new JAXBElement<GetLeague>(_GetLeague_QNAME, GetLeague.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLeagueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "updateLeagueResponse")
    public JAXBElement<UpdateLeagueResponse> createUpdateLeagueResponse(UpdateLeagueResponse value) {
        return new JAXBElement<UpdateLeagueResponse>(_UpdateLeagueResponse_QNAME, UpdateLeagueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLeague }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "updateLeague")
    public JAXBElement<UpdateLeague> createUpdateLeague(UpdateLeague value) {
        return new JAXBElement<UpdateLeague>(_UpdateLeague_QNAME, UpdateLeague.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPlayersLeague }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getBestPlayersLeague")
    public JAXBElement<GetBestPlayersLeague> createGetBestPlayersLeague(GetBestPlayersLeague value) {
        return new JAXBElement<GetBestPlayersLeague>(_GetBestPlayersLeague_QNAME, GetBestPlayersLeague.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "updateTeamResponse")
    public JAXBElement<UpdateTeamResponse> createUpdateTeamResponse(UpdateTeamResponse value) {
        return new JAXBElement<UpdateTeamResponse>(_UpdateTeamResponse_QNAME, UpdateTeamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLeagueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "deleteLeagueResponse")
    public JAXBElement<DeleteLeagueResponse> createDeleteLeagueResponse(DeleteLeagueResponse value) {
        return new JAXBElement<DeleteLeagueResponse>(_DeleteLeagueResponse_QNAME, DeleteLeagueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLeaguesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getAllLeaguesResponse")
    public JAXBElement<GetAllLeaguesResponse> createGetAllLeaguesResponse(GetAllLeaguesResponse value) {
        return new JAXBElement<GetAllLeaguesResponse>(_GetAllLeaguesResponse_QNAME, GetAllLeaguesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "deletePlayer")
    public JAXBElement<DeletePlayer> createDeletePlayer(DeletePlayer value) {
        return new JAXBElement<DeletePlayer>(_DeletePlayer_QNAME, DeletePlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateLeague }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "createLeague")
    public JAXBElement<CreateLeague> createCreateLeague(CreateLeague value) {
        return new JAXBElement<CreateLeague>(_CreateLeague_QNAME, CreateLeague.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLeagueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getLeagueResponse")
    public JAXBElement<GetLeagueResponse> createGetLeagueResponse(GetLeagueResponse value) {
        return new JAXBElement<GetLeagueResponse>(_GetLeagueResponse_QNAME, GetLeagueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPlayersLeagueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getBestPlayersLeagueResponse")
    public JAXBElement<GetBestPlayersLeagueResponse> createGetBestPlayersLeagueResponse(GetBestPlayersLeagueResponse value) {
        return new JAXBElement<GetBestPlayersLeagueResponse>(_GetBestPlayersLeagueResponse_QNAME, GetBestPlayersLeagueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "addPlayerResponse")
    public JAXBElement<AddPlayerResponse> createAddPlayerResponse(AddPlayerResponse value) {
        return new JAXBElement<AddPlayerResponse>(_AddPlayerResponse_QNAME, AddPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "deleteTeam")
    public JAXBElement<DeleteTeam> createDeleteTeam(DeleteTeam value) {
        return new JAXBElement<DeleteTeam>(_DeleteTeam_QNAME, DeleteTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "updateTeam")
    public JAXBElement<UpdateTeam> createUpdateTeam(UpdateTeam value) {
        return new JAXBElement<UpdateTeam>(_UpdateTeam_QNAME, UpdateTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeamById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getTeamById")
    public JAXBElement<GetTeamById> createGetTeamById(GetTeamById value) {
        return new JAXBElement<GetTeamById>(_GetTeamById_QNAME, GetTeamById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLeague }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "deleteLeague")
    public JAXBElement<DeleteLeague> createDeleteLeague(DeleteLeague value) {
        return new JAXBElement<DeleteLeague>(_DeleteLeague_QNAME, DeleteLeague.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTeamByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getTeamByIdResponse")
    public JAXBElement<GetTeamByIdResponse> createGetTeamByIdResponse(GetTeamByIdResponse value) {
        return new JAXBElement<GetTeamByIdResponse>(_GetTeamByIdResponse_QNAME, GetTeamByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBestPlayerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getBestPlayerResponse")
    public JAXBElement<GetBestPlayerResponse> createGetBestPlayerResponse(GetBestPlayerResponse value) {
        return new JAXBElement<GetBestPlayerResponse>(_GetBestPlayerResponse_QNAME, GetBestPlayerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteTeamResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "deleteTeamResponse")
    public JAXBElement<DeleteTeamResponse> createDeleteTeamResponse(DeleteTeamResponse value) {
        return new JAXBElement<DeleteTeamResponse>(_DeleteTeamResponse_QNAME, DeleteTeamResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllLeagues }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "getAllLeagues")
    public JAXBElement<GetAllLeagues> createGetAllLeagues(GetAllLeagues value) {
        return new JAXBElement<GetAllLeagues>(_GetAllLeagues_QNAME, GetAllLeagues.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "addPlayer")
    public JAXBElement<AddPlayer> createAddPlayer(AddPlayer value) {
        return new JAXBElement<AddPlayer>(_AddPlayer_QNAME, AddPlayer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlayer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://endpoints.soap.foot/", name = "updatePlayer")
    public JAXBElement<UpdatePlayer> createUpdatePlayer(UpdatePlayer value) {
        return new JAXBElement<UpdatePlayer>(_UpdatePlayer_QNAME, UpdatePlayer.class, null, value);
    }

}
