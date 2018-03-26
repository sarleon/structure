package Skiff.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="topic")
public class Topic implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String initiator;
	private String title;
	private Date publishTime;
	private Set<Comment> comments=new HashSet<Comment>();
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getInitiator() {
		return initiator;
	}
	public void setInitiator(String initiator) {
		this.initiator = initiator;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
			name="comontop",
			joinColumns=
			@JoinColumn(name="tid", referencedColumnName="id"),
			inverseJoinColumns=
			@JoinColumn(name="cid", referencedColumnName="id")
			)
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	
}