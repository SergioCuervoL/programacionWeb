package src;

import java.util.ArrayList;
import java.util.Date;

public class ControladorNoticias {
	
	ArrayList<News> nal = new ArrayList<News>();

	public ArrayList<News> agregarNoticia(String titulo, String url, ArrayList<News> n) {
		News noticia=null;
		nal = n;
		String usuario="";
		int puntos = 0;
		String idPublicacion = String.valueOf(nal.size());
		String fecha="";
		Date f = new Date();
		fecha = f.toString();
		noticia = new News(titulo, usuario,url, puntos, idPublicacion, fecha);
		nal.add(noticia);
		n = nal;
		return n;	
	}
	
	public String modificarPublicacion(ArrayList<News> news, String titulo, String url, String idPublicacion) {
		News n = null;
		String res="No se pudo hacer la modificacion";
		for(int i = 0; i < news.size(); i++) {
			n = news.get(i);
			if(idPublicacion.equals(n.getIdPublicación())) {
				n.setTitulo(titulo);
				n.setUrl(url);
				res = "La publicacion fue modificada";
			}
		}
		return res;
	}
	
	public String elimarPublicacion(ArrayList<News> news, String idPublicacion) {
		News n = null;
		String res="No se pudo hacer la Eliminar";
		for(int i = 0; i < news.size(); i++) {
			n = news.get(i);
			if(idPublicacion.equals(n.getIdPublicación())) {
				news.remove(i);
				res = "La publicacion fue eliminada";
			}
		}
		return res;
	}
	
	public Boolean buscarNoticia(ArrayList<News> news, String idPublicacion) {
		Boolean res = false;
		News n = null;
		nal = news;
		for(int i = 0; i < nal.size(); i++) {
			n = nal.get(i);
			if(n.getIdPublicación().equals(idPublicacion)) {
				res = true;
			}
		}
		return res;
	}
}
