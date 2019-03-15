package src;

import java.util.ArrayList;
import java.util.Date;

public class ControladorNoticias {
	
	ArrayList<News> nal = new ArrayList<News>();

	public ArrayList<News> agregarNoticia(String titulo, String url, ArrayList<News> n) {
		News noticia=null;
		nal = n;
		String res="Noticia Agregada";
		String usuario="";
		int puntos = 0;
		int idPublicacion = nal.size();
		String fecha="";
		Date f = new Date();
		fecha = f.toString();
		noticia = new News(titulo, usuario,url, puntos, idPublicacion, fecha);
		nal.add(noticia);
		n = nal;
		return n;	
	}
	
	public String modificarPublicacion(ArrayList<News> news, String titulo, String url, int idPublicacion) {
		News n = null;
		String res="No se pudo hacer la modificacion";
		for(int i = 0; i < news.size(); i++) {
			n = news.get(i);
			if(idPublicacion == n.getIdPublicación()) {
				n.setTitulo(titulo);
				n.setUrl(url);
				res = "La publicacion fue modificada";
			}
		}
		return res;
	}
	
	public String elimarPublicacion(ArrayList<News> news, int idPublicacion) {
		News n = null;
		String res="No se pudo hacer la Eliminar";
		for(int i = 0; i < news.size(); i++) {
			n = news.get(i);
			if(idPublicacion == n.getIdPublicación()) {
				news.remove(i);
				res = "La publicacion fue eliminada";
			}
		}
		return res;
	}
	
	public ArrayList<News> filtrarPublicacion(ArrayList<News> n){
		News n1 = null;
		News n2 = null;
		int aux=0;
		nal = n;
		for(int i = 0; i < nal.size(); i++){
			n1 = nal.get(i);
			for(int j=i+1; j < nal.size(); j++){
				n2 = nal.get(j);
				if(n1.getPuntos() < n2.getIdPublicación()){
					aux = n1.getPuntos();
					n1.setPuntos(n2.getPuntos());
					n2.setPuntos(aux);
				}
			}
		}
		n = nal;
		return n;
	}
	
	public ArrayList<News> votarPublicacion(ArrayList<News> n, int idNoticia){
		News n1 = null;
		nal = n;
		for(int i = 0; i < nal.size(); i++){
			n1 = nal.get(i);
			if(n1.getIdPublicación() == idNoticia) {
				n1.setPuntos(n1.getPuntos()+1);
			}
		}
		n = nal;
		return n;
	}
	
}
