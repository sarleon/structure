package Skiff.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name="routeplan")
public class RoutePlan implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private int orderOfDay;
	private int targetId;
	private int pid;
	private Places place;
	
	
	
	
	public int getOrderOfDay() {
		return orderOfDay;
	}
	public void setOrderOfDay(int orderOfDay) {
		this.orderOfDay = orderOfDay;
	}
	public int getTargetId() {
		return targetId;
	}
	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Places getPlace() {
		return place;
	}
	public void setPlace(Places place) {
		this.place = place;
	}
	
	
}