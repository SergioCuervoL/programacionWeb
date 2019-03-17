package src;

public class Comment {
	
	public String comentario,tituloNoticia,idComentario,idNoticia;
	public Comment(String comentario, String tituloNoticia, String idComentario, String idNoticia) {
		this.comentario = comentario;
		this.tituloNoticia = tituloNoticia;
		this.idComentario = idComentario;
		this.idNoticia = idNoticia;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getTituloNoticia() {
		return tituloNoticia;
	}
	public void setTituloNoticia(String tituloNoticia) {
		this.tituloNoticia = tituloNoticia;
	}
	public String getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(String idComentario) {
		this.idComentario = idComentario;
	}
	public String getIdNoticia() {
		return idNoticia;
	}
	public void setIdNoticia(String idNoticia) {
		this.idNoticia = idNoticia;
	}	
}
