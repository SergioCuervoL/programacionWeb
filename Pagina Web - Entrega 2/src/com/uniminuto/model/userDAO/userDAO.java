package com.uniminuto.model.userDAO;
import com.uniminuto.model.Users;
public interface userDAO {
	public int addUser(Users u);
	public Users searchUser(String username);
}