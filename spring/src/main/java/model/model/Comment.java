package Skiff.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="comment")
public class Comment implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String type;
	private String uid;
	private Date date;
	private String content;
	private int targetId;
	private Set<Comment> commentOnMe=new HashSet<Comment>();
	
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	public Set<Comment> getCommentOnMe() {
		return commentOnMe;
	}
	public void setCommentOnMe(Set<Comment> commentOnMe) {
		this.commentOnMe = commentOnMe;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getTargetId() {
		return targetId;
	}
	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}
	
	
}