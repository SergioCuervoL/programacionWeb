package com.uniminuto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import src.Comment;
import src.ControladorComentario;

/**
 * Servlet implementation class Comentario2
 */
@WebServlet("/Comentario2")
public class Comentario2 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	ArrayList<Comment> news = new ArrayList<Comment>();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Comment n = null;
		ControladorComentario c = new ControladorComentario();
        String idNoticia = request.getParameter("idPublicacion");
        String tituloNoticia = request.getParameter("titule");
        String comentario = request.getParameter("comentario");
        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>" + 
	        		"<html>" + 
	        		"<head>" + 
	        		"<meta charset=\"ISO-8859-1\">" + 
	        		"<title>Comentario</title>" + 
	        		"</head>" + 
	        		"<body>" + 
	        		"	<div align=\"center\" style=\"margin-top: 50px;\">" + 
	        		"        <form action=\"Comentario2\">" + 
	        		"			<input type=\"hidden\" id=\"idPublicacion\" name=\"idPublicacion\" value=\""+idNoticia+"\">"+
	        		"			<input type=\"hidden\" id=\"tituloNot\" name=\"tituloNot\" value=\""+tituloNoticia+"\">"+
	        		"            Title:  <input type=\"text\" id=\"titule\" name=\"titule\" value=\""+tituloNoticia+"\" size=\"20px\"> <br>" + 
	        		"            Comentario:  <input type=\"text\" id=\"titule\" name=\"comentario\" size=\"20px\"> <br><br>" + 
	        		"        	<input type=\"submit\" value=\"submit\">" + 
	        		"        </form>" + 
	        		"	</div>");
        if(comentario != null) {
        	news = c.agregarComentario(news, idNoticia, tituloNoticia, comentario); 
        }    	
        for(int i = 0; i < news.size(); i++) {
    		n = news.get(i);
    		if(tituloNoticia.equals(n.getTituloNoticia())) {
        		out.print(
            			"	<div>"+
            					"<h3>"+n.getTituloNoticia()+"</h3>"+
            					"<h4>"+n.getComentario()+"</h4>"+
    					"	</div>"
            			);
    		}
    	}		
    	out.print(
    			"</body>"+
    			"</html>"
    			);	
	}

}
