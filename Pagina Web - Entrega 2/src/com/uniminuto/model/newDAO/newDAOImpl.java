package com.uniminuto.model.newDAO;
import com.uniminuto.model.News;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class newDAOImpl {
	private static News ne;
	private static ArrayList<News>list = new ArrayList<News>();
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
    public int addNew(News n){  
        int status=0;  
        try{  
            Connection con=newDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into Noticia(titulo,url,fecha,idPublicacion,puntos,username) values (?,?,?,?,?,?)");  
            ps.setString(1,n.getTituleNew());  
            ps.setString(2,n.getUrl());  
            ps.setString(3,n.getDate());  
            ps.setInt(4,n.getIdNew());
            ps.setInt(5,n.getPoint());  
            ps.setString(6,n.getUsername());   
            status=ps.executeUpdate();                
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}      
        return status;  
    }  
    public int updateNew(News n){  
        int status=0;  
        try{  
            Connection con=newDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update Noticia set titulo=?,url=?,fecha=?,puntos=?,username=? where idPublicacion=?");  
            ps.setString(1,n.getTituleNew());  
            ps.setString(2,n.getUrl());  
            ps.setString(3,n.getDate());  
            ps.setInt(4,n.getIdNew());
            ps.setInt(5,n.getPoint());  
            ps.setString(6,n.getUsername());                 
            status=ps.executeUpdate();               
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}         
        return status;  
    }  
    public int deleteNew(int id){  
        int status=0;  
        try{  
            Connection con=newDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement("delete from Noticia where idPublicacion=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();    
            con.close();  
        }catch(Exception e){e.printStackTrace();}     
        return status;  
    }   
    public List<News> readNews(){          
        try{  
            Connection con=newDAOImpl.connection();  
            PreparedStatement ps=con.prepareStatement("select * from Noticia");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                ne = null;  
                ne.setTituleNew(rs.getString(1));  
                ne.setUrl(rs.getString(2));  
                ne.setDate(rs.getString(3));  
                ne.setIdNew(rs.getInt(4));
                ne.setPoint(rs.getInt(5));  
                ne.setUsername(rs.getString(6));   
                list.add(ne);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}       
        return list;  
    }  
}
