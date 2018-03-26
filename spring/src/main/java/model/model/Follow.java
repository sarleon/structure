package Skiff.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Table(name="follow")
public class Follow implements Serializable{
	private static final long serialVersionUID = 1L;
	private String author;
	private String follower;
	private Date addTime;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Id
	public String getFollower() {
		return follower;
	}
	public void setFollower(String follower) {
		this.follower = follower;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
	
}