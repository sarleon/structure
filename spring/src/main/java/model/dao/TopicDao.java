package Skiff.dao;

import java.util.List;

import edu.nju.hello_order.temp_model.Topic;

public interface TopicDao {
	
	public Topic getTopicByID(int id);
	
	public List<Topic> getTopicByAuthor(String uid);
	
	public List<Topic> getTopicByTitle(String searchKey);
	
	public int addTopic(Topic topic);
	

}
