package Skiff.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Table(name="fond")
public class Fond implements Serializable{
	private static final long serialVersionUID = 1L;
	private String uid;
	private int nid;
	private Date addTime;
	
	@Id
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getNid() {
		return nid;
	}
	public void setNid(int nid) {
		this.nid = nid;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	
	
}