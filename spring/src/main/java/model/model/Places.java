package Skiff.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="places")
public class Places implements Serializable{
	private static final long serialVersionUID = 1L;
	private int id;
	private String playOrEat;
	private String name;
	private String city;
	private String addr;
	private String type;
	private int hot;
	private String des;
	
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlayOrEat() {
		return playOrEat;
	}
	public void setPlayOrEat(String playOrEat) {
		this.playOrEat = playOrEat;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHot() {
		return hot;
	}
	public void setHot(int hot) {
		this.hot = hot;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	
}