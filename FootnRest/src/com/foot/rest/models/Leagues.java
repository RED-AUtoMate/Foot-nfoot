package com.foot.rest.models;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Leagues {
	private ArrayList<League> lgs;

	public ArrayList<League> getLgs() {
		return lgs;
	}

	public void setLgs(ArrayList<League> lgs) {
		this.lgs = lgs;
	}

}
