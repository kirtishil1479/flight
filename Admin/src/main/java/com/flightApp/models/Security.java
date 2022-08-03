package com.flightApp.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Security {
	
	@Id
	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Security [username=" + username + ", password=" + password + "]";
	}
	public Security(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	public Security() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
