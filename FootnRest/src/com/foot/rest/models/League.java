package com.foot.rest.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class League {
	private int id;
	private String league_name;
	private String league_code;
	private String league_country;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLeague_name() {
		return league_name;
	}
	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}
	public String getLeague_code() {
		return league_code;
	}
	public void setLeague_code(String league_code) {
		this.league_code = league_code;
	}
	public String getLeague_country() {
		return league_country;
	}
	public void setLeague_country(String league_country) {
		this.league_country = league_country;
	}
	@Override
	public String toString() {
		return "League [id=" + id + ", league_name=" + league_name + ", league_code=" + league_code
				+ ", league_country=" + league_country + "]";
	}
	
	
	
	
}
