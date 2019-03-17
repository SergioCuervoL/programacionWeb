package com.uniminuto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.ControladorNoticias;
import src.News;

/**
 * Servlet implementation class Noticia
 */
@WebServlet("/Noticia")
public class Noticia extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	ArrayList<News> news = new ArrayList<News>();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		News n = null;
		Boolean res = false;
		ControladorNoticias c = new ControladorNoticias();
		String titule = request.getParameter("titule");
        String url = request.getParameter("url");
        String idPublicacion = request.getParameter("custId");
        PrintWriter out = response.getWriter();
        res = c.buscarNoticia(news, idPublicacion);
    	if(res == false) {
    		c.agregarNoticia(titule, url, news);
    	}
    	else {
        	for(int i = 0; i < news.size(); i++) {
            	n = news.get(i);
            	if(idPublicacion.equals(n.getIdPublicación())) {
            		n.setPuntos(n.getPuntos()+1);
            	}
            }
    	}              
        for(int i = 0; i < news.size(); i++) {
        	n = news.get(i);
        	out.println(
        			"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                            "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                        "<html> \n" +
                          "<head> \n" +
                            "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                              "charset=ISO-8859-1\"> \n" +
                            "<title> Noticias Publicadas  </title> \n" +
                          "</head> \n" +
                          "<body> "+
                          "	<form action=\"Comentario2\">"+
	                          	"<div align='center'> \n" +
	                          		"<input type=\"hidden\" id=\"idPublicacion\" name=\"idPublicacion\" value=\""+n.getIdPublicación()+"\">"+
	                          		"<input type=\"hidden\" id=\"titule\" name=\"titule\" value=\""+n.getTitulo()+"\">"+
	                          		"<a href=\""+n.getUrl()+"\">"+n.getTitulo()+"</a> "+
	                          		"<a href=\"http://localhost:9090/Ingreso/Noticia?titule="+n.getTitulo()+"&url="+n.getUrl()+"&custId="+n.getIdPublicación()+"\">Puntos: </a>"+
	                          		"<p>"+n.getPuntos()+"</p><br>"+
	                          		"<input type=\"submit\" value=\"submit\"> <br>"+
	                          		n.getFecha()+
	                          	"</div>"+
                      		"</form>"+
                          "</body> \n" +
                        "</html>" 
			);
        }   
	}
}
