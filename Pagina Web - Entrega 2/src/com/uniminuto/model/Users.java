package com.uniminuto.model;
public class Users {
	public String username;
	public String passwork;
	public Users(String username, String passwork) {
		this.username = username;
		this.passwork = passwork;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswork() {
		return passwork;
	}
	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}
}
