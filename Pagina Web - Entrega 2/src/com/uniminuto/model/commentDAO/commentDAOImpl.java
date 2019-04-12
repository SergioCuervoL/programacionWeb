package com.uniminuto.model.commentDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.uniminuto.model.Comment;
import com.uniminuto.model.newDAO.newDAOImpl;
public class commentDAOImpl implements commentDAO{
	private static Comment co;
	private static ArrayList<Comment> list = new ArrayList<Comment>();
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
	public int addComment(Comment c) {
		int status=0;  
        try{  
            Connection con=commentDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Comentario(titulo,url,fecha,idPublicacion,puntos,username) values (?,?,?,?,?)");  
            ps.setInt(1,c.getIdComment());  
            ps.setString(2,c.getTituleNew());  
            ps.setString(3,c.getComment());  
            ps.setInt(4,c.getIdNew());
            ps.setString(5,c.getUsername());
            status=ps.executeUpdate();                
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}      
        return status;
	}

	@Override
	public int deleteComment(int id) {
		int status=0;  
        try{  
            Connection con=commentDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement("delete from Comentario where idPublicacion=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();    
            con.close();  
        }catch(Exception e){e.printStackTrace();}     
        return status;  
	}

	@Override
	public List<Comment> readComment() {
		try{  
            Connection con=newDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement("select * from Comentario");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                co = null;  
                co.setIdComment(rs.getInt(1));  
                co.setTituleNew(rs.getString(2));  
                co.setComment(rs.getString(3));  
                co.setIdNew(rs.getInt(4));
                co.setUsername(rs.getString(5));    
                list.add(co);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}       
        return list;  
    } 
}
