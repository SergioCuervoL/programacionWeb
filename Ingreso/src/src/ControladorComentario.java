package src;

import java.util.ArrayList;

public class ControladorComentario {
	
	ArrayList<Comment> comment = new ArrayList<Comment>();
	
	public ArrayList<Comment> agregarComentario(ArrayList<Comment> nc, String idNoticia, String tituloNoticia, String comenta) {
		Comment c = null;
		comment = nc;
		String comentario = comenta;
		String tNoticia = tituloNoticia;
		String idComentario = String.valueOf(comment.size());
		String idNot = idNoticia;
		c = new Comment(comentario, tNoticia, idComentario, idNot);
		comment.add(c);
		nc = comment;
		return nc;
	}
	
	public Boolean buscarComentario(ArrayList<Comment> nc, String idComentario) {
		Boolean res = false;
		Comment c = null;
		comment = nc;
		for(int i = 0; i < comment.size(); i++) {
			c = comment.get(i);
			if(c.getIdComentario().equals(idComentario)) {
				res = true;
			}
		}
		return res;
	}

}
