package Skiff.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String id;
	private String password;
	private String name;
	private String headPath;
	private String gender;
	private String mail;
	private List<User> follow;
	private List<Note> likes;
	private List<Note> myNote;
	private List<Wish> myWish;
	
	@Id
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadPath() {
		return headPath;
	}
	public void setHeadPath(String headPath) {
		this.headPath = headPath;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public List<User> getFollow() {
		return follow;
	}
	public void setFollow(List<User> follow) {
		this.follow = follow;
	}
	public List<Note> getLikes() {
		return likes;
	}
	public void setLikes(List<Note> likes) {
		this.likes = likes;
	}
	public List<Note> getMyNote() {
		return myNote;
	}
	public void setMyNote(List<Note> myNote) {
		this.myNote = myNote;
	}
	public List<Wish> getMyWish() {
		return myWish;
	}
	public void setMyWish(List<Wish> myWish) {
		this.myWish = myWish;
	}
	
	
	
}