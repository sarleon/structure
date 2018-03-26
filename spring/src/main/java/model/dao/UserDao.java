package Skiff.dao;

import edu.nju.hello_order.temp_model.User;
import edu.nju.hello_order.temp_model.Wish;

public interface UserDao {
	
	public User getUserByID(String id);
	
	public int modUserInfo(User user);
	
	public int addFollow(String author,String fans);
	
	public int deleteFollow(String author,String fans);
	
	public int addFond(String uid,int nid);
	
	public int deleteFond(String uid,int nid);
	
	public int addWish(Wish wish);
	
	public int deleteWish(String uid,int wid);
}
