package com.foot.rest.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private int id;
	private String LastName;
	private String FirsName;
	private String Email;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirsName() {
		return FirsName;
	}
	public void setFirsName(String firsName) {
		FirsName = firsName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;

	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", LastName=" + LastName + ", FirsName=" + FirsName + ", Email=" + Email
				+ ", password=" + password + "]";
	}
	
	


}
