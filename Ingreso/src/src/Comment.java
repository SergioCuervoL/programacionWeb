package src;

public class Comment {
	
	public String comentario;
	public int idComentario;
	public int idNoticia;
	public Comment(String comentario, int idComentario, int idNoticia) {
		this.comentario = comentario;
		this.idComentario = idComentario;
		this.idNoticia = idNoticia;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public int getIdNoticia() {
		return idNoticia;
	}
	public void setIdNoticia(int idNoticia) {
		this.idNoticia = idNoticia;
	}
	
}
