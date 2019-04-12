package com.uniminuto.controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.uniminuto.model.Users;
import com.uniminuto.model.userDAO.userDAOImpl;
public class User extends HttpServlet{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(!username.equals("") && !password.equals("")) {
        	userDAOImpl udao = new userDAOImpl();
        	Users u = new Users(username, password);
        	udao.addUser(u);
        }       	
    }
}
