package com.uniminuto.model.commentDAO;
import com.uniminuto.model.Comment;
import java.util.List;
public interface commentDAO {
	public int addComment(Comment c); 
    public int deleteComment(int id);  
    public List<Comment> readComment();
}
