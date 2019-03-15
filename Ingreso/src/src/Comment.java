package src;

public class Comment {
	
	public String comentario;
	public int idComentario;
	public Comment(String comentario, int idComentario) {
		this.comentario = comentario;
		this.idComentario = idComentario;
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
}
