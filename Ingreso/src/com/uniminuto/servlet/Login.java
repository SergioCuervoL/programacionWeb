package com.uniminuto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import src.*;

@WebServlet("/IngresoServlet")

public class Login extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	ArrayList<Usuario> users = new ArrayList<Usuario>();
	int numUs=0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input 
		ControladorUsuario c = new ControladorUsuario();
		Usuario u = null;
		String resp = "";
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter out = response.getWriter();
        ControladorUsuario controller = new ControladorUsuario();
        users = controller.agregarUsuario(username, password, users);
        if(users.size() > numUs) {
        	numUs = users.size();
        	resp = "Usuario Creado";
        }else {
        	resp = c.identificarse(username, password, users);
        }    
        if(resp.equals("Ingreso Correctamente")) {
        	String site = "http://localhost:8080/Ingreso/publicacion.jsp";
        	response.setContentType("text/html");
        	response.setStatus(response.SC_MOVED_TEMPORARILY);
        	response.setHeader("Location", site);
        }else {
        	String site = "http://localhost:8080/Ingreso/";
        	response.setContentType("text/html");
        	response.setStatus(response.SC_MOVED_TEMPORARILY);
        	response.setHeader("Location", site);
        }
    }
}