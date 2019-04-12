package com.uniminuto.model.newDAO;
import com.uniminuto.model.News;
import java.util.List;
public interface newDAO { 
    public int addNew(News n);  
    public int updateNew(News n);  
    public int deleteNew(int id);  
    public List<News> readNews();
    public void addVote(int idNew, String username);
}
