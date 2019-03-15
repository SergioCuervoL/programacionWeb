package src;

public class Respuestas {
	
	public Usuario users;
	public String res;
	public Respuestas(Usuario users, String res) {
		this.users = users;
		this.res = res;
	}
	public Usuario getUsers() {
		return users;
	}
	public void setUsers(Usuario users) {
		this.users = users;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
}