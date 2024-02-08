package edu.jsp.one_toone.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Engine {
	
	@Id
	private int Engid;
	private String Ename;
	private double hp;
	
	
	public int getEngid() {
		return Engid;
	}
	public void setEngid(int engid) {
		Engid = engid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public double getHp() {
		return hp;
	}
	public void setHp(double hp) {
		this.hp = hp;
	}
	public Engine() {
		super();
	}
	
	

}
