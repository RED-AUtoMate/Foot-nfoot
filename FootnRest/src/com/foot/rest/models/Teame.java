package com.foot.rest.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Teame {
	
	int id;
	private String name;
	int goals_for;
	int goals_against;
	int points;
	int classement;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGoals_for() {
		return goals_for;
	}
	public void setGoals_for(int goals_for) {
		this.goals_for = goals_for;
	}
	public int getGoals_against() {
		return goals_against;
	}
	public void setGoals_against(int goals_against) {
		this.goals_against = goals_against;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getClassement() {
		return classement;
	}
	public void setClassement(int classement) {
		this.classement = classement;
	}
	
	

}
