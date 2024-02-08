package edu.jsp.one_toone_bi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Car {
	
	@Id
	private int Carid;
	//private String Carname;
	private String Model;
	private String Brand;
	private double Cost;
	
	
	@OneToOne
	private Engine engine;
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public int getCarid() {
		return Carid;
	}
	public void setCarid(int carid) {
		Carid = carid;
	}
//	public String getCarname() {
//		return Carname;
//	}
//	public void setCarname(String carname) {
//		Carname = carname;
//	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	public Car() {
		super();
	}
	
	
	

}
