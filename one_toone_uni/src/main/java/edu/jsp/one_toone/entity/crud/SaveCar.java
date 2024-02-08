package edu.jsp.one_toone.entity.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.one_toone.entity.Car;
import edu.jsp.one_toone.entity.Engine;

public class SaveCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("one_toone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Engine engine=new Engine();
		engine.setEname("K10");
		engine.setEngid(2);
		engine.setHp(96.0);
		
		Car car=new Car();
		car.setCarid(2);
		//car.setCarname("Alto 800");
		car.setBrand("Maruti");
		car.setCost(15000);
		car.setModel("Alto 800");
		car.setEngine(engine);
		
		transaction.begin();
		manager.persist(engine);
		manager.persist(car);
		transaction.commit();
		System.out.println("Car saved");
		
		

	}

}
