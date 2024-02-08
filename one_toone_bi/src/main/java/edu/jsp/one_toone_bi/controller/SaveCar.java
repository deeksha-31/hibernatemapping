package edu.jsp.one_toone_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.one_toone_bi.entity.Car;
import edu.jsp.one_toone_bi.entity.Engine;



public class SaveCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("one_toone_bi");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=new Car();
		car.setCarid(2);
		
		car.setBrand("Honda");
		car.setCost(15000);
		car.setModel("City");
		
		
		
		Engine engine=new Engine();
		engine.setEname("K10");
		engine.setEngid(1);
		engine.setHp(96.0);
		
		car.setEngine(engine);
		engine.setCar(car);
		
		
		
		transaction.begin();
		manager.persist(car);
		manager.persist(engine);
		transaction.commit();
		System.out.println("Car saved");
		
		

	}

}
