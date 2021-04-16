package com.foot.rest.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teame {
	
	private int id;
	private String team_name;
	private int classment;
	private int pts;
	private int bp;
	private int bc;
	private int league;
	private String last_result;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getClassment() {
		return classment;
	}
	public void setClassment(int classment) {
		this.classment = classment;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = pts;
	}
	public int getBp() {
		return bp;
	}
	public void setBp(int bp) {
		this.bp = bp;
	}
	public int getBc() {
		return bc;
	}
	public void setBc(int bc) {
		this.bc = bc;
	}
	public int getLeague() {
		return league;
	}
	public void setLeague(int league) {
		this.league = league;
	}
	public String getLast_result() {
		return last_result;
	}
	public void setLast_result(String last_result) {
		this.last_result = last_result;
	}
	
	
}
