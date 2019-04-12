package com.uniminuto.model;
public class Comment {
	public int idComment;
	public String tituleNew;
	public String username;
	public String comment;
	public int idNew;
	Comment(int idComment, String tituleNew, String username, String comment, int idNew) {
		this.idComment = idComment;
		this.tituleNew = tituleNew;
		this.username = username;
		this.comment = comment;
		this.idNew = idNew;
	}
	public int getIdComment() {
		return idComment;
	}
	public void setIdComment(int idComment) {
		this.idComment = idComment;
	}
	public String getTituleNew() {
		return tituleNew;
	}
	public void setTituleNew(String tituleNew) {
		this.tituleNew = tituleNew;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getIdNew() {
		return idNew;
	}
	public void setIdNew(int idNew) {
		this.idNew = idNew;
	}
}