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
		ControladorNoticias c = new ControladorNoticias();
		String titule = request.getParameter("titule");
        String url = request.getParameter("url");
        PrintWriter out = response.getWriter();
        news = c.agregarNoticia(titule, url, news);
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
                          	"<div align='center'> \n" +
                          		"<a href=\""+n.getUrl()+"\">"+n.getTitulo()+"</a> <br>"+
                          		n.getFecha()+
                          	"</div>"+
                          "</body> \n" +
                        "</html>" 
        			);
        }
        
	}

}
