package Skiff.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="route")
public class Route implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String type;
	private String city;
	private int daysOfPlan;
	private String feature;
	private List<RoutePlan> plans;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getDaysOfPlan() {
		return daysOfPlan;
	}
	public void setDaysOfPlan(int daysOfPlan) {
		this.daysOfPlan = daysOfPlan;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public List<RoutePlan> getPlans() {
		return plans;
	}
	public void setPlans(List<RoutePlan> plans) {
		this.plans = plans;
	}
	
	
}