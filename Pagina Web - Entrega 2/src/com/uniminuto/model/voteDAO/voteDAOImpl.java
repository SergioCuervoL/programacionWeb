package com.uniminuto.model.voteDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.uniminuto.model.Votes;
import com.uniminuto.model.newDAO.newDAOImpl;
public class voteDAOImpl implements voteDAO{
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
	public int addNew(Votes v) {
		int status=0;  
        try{  
            Connection con=newDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Voto(titulo,url,fecha,idPublicacion,puntos,username) values (?,?,?,?,?,?)");  
            ps.setInt(1,v.getIdVote());  
            ps.setInt(2,v.getIdVote());  
            ps.setString(3,v.getUsername());    
            status=ps.executeUpdate();                
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}      
        return status; 
	}

	@Override
	public int deleteNew(int id) {
		int status=0;  
        try{  
            Connection con=newDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement("delete from Voto where idPublicacion=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();    
            con.close();  
        }catch(Exception e){e.printStackTrace();}     
        return status; 
	}

}
