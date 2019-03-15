package src;

import java.util.Date;

public class News {
	
	public String titulo, usuario, url,fecha;
	public int puntos, idPublicaci�n;	
	public News(String titulo, String usuario, String url, int puntos, int idPublicaci�n, String fecha) {
		this.titulo = titulo;
		this.usuario = usuario;
		this.url = url;
		this.puntos = puntos;
		this.idPublicaci�n = idPublicaci�n;
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getIdPublicaci�n() {
		return idPublicaci�n;
	}
	public void setIdPublicaci�n(int idPublicaci�n) {
		this.idPublicaci�n = idPublicaci�n;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
