package edu.jsp.one_toone_bi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	
	@Id
	private int Engid;
	private String Ename;
	private double hp;
	
	@OneToOne(mappedBy="engine")
	private Car car;
	
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
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Engine() {
		super();
	}
	

}
