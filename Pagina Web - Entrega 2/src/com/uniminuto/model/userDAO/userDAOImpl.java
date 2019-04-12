package com.uniminuto.model.userDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.uniminuto.model.Users;
public class userDAOImpl implements userDAO{
	private Users us;
	public static Connection connection() throws SQLException, ClassNotFoundException {
		String dbDriver = "com.mysql.jdbc.Driver"; 
        String dbURL = "jdbc:mysql://localhost:3306/"; 
        String dbName = "curd_test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
        String dbUsername = "root"; 
        String dbPassword = ""; 
        try {
			Class.forName(dbDriver);
		} catch (Exception e) {
			e.printStackTrace();
		} 
        Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword); 
        return con; 
	}
	@Override
	public int addUser(Users u) {
		int status=0;  
        try{  
            Connection con= userDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Usuario(username,password) values (?,?)");  
            ps.setString(1,u.getUsername());  
            ps.setString(2,u.getPasswork());          
            status=ps.executeUpdate();            
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
        return status; 
	}
	@Override
	public Users searchUser(String username) {
		us = null;  
        try{  
            Connection con=userDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement("select * from Usuario where username=?");  
            ps.setString(1,username);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                us.setUsername(rs.getString(1));  
                us.setPasswork(rs.getString(2));   
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}            
        return us;
	}
}