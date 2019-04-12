package com.uniminuto.model.voteDAO;
import com.uniminuto.model.Votes;
public interface voteDAO {
	public int addNew(Votes v);
	public int deleteNew(int id); 
}
