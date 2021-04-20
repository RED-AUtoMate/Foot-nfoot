package foot.soap.main;

import foot.soap.endpoints.CreateLeague;
import foot.soap.endpoints.EndpointImplementationService;
import foot.soap.endpoints.League;

public class Main {

	public static void main(String[] args) {
		EndpointImplementationService endpointImplementationService = new EndpointImplementationService();
		League ll = new League();
		ll.setLeagueCode("hhhh");
		ll.setLeagueCountry("hhh");
		ll.setLeagueName("hhh");
		endpointImplementationService.getEndpointImplementationPort().createLeague(ll);
	}

}
