package Skiff.dao;

import java.util.List;

import edu.nju.hello_order.temp_model.Comment;

public interface CommentDao {
	
	public Comment getCommentByID(int id);
	
	public List<Comment> getCommentByTID(int tid,String type);
	
	public int addComment(Comment comment);

}
