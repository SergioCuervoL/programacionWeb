package com.uniminuto.model;
public class News {
	public int idNew;
	public int point;
	public String tituleNew;
	public String username;
	public String date;
	public String url;
	public News(int idNew, int point, String tituleNew, String username, String date, String url) {
		this.idNew = idNew;
		this.point = point;
		this.tituleNew = tituleNew;
		this.username = username;
		this.date = date;
		this.url = url;
	}
	public int getIdNew() {
		return idNew;
	}
	public void setIdNew(int idNew) {
		this.idNew = idNew;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
