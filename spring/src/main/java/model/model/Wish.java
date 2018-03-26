package Skiff.model;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.*;

@Table(name="wish")
public class Wish implements Serializable{
	private static final long serialVersionUID = 1L;
	private String uid;
	private int type;
	private int wid;
	private int pid;
	private String des;
	private Date addTime;
	private Places place;
	
	@Id
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public Places getPlace() {
		return place;
	}
	public void setPlace(Places place) {
		this.place = place;
	}
	
	
}