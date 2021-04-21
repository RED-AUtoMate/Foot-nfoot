package com.foot.rest.models;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Playerss {
	private ArrayList<Players> players;

	public ArrayList<Players> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Players> players) {
		this.players = players;
	}

}
