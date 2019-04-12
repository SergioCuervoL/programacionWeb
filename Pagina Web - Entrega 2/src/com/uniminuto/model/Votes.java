package com.uniminuto.model;
public class Votes {
	public int idVote;
	public String username;
	public int idNew;
	public Votes(int idVote, String username, int idNew) {
		this.idVote = idVote;
		this.username = username;
		this.idNew = idNew;
	}
	public int getIdVote() {
		return idVote;
	}
	public void setIdVote(int idVote) {
		this.idVote = idVote;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getIdNew() {
		return idNew;
	}
	public void setIdNew(int idNew) {
		this.idNew = idNew;
	}
}
