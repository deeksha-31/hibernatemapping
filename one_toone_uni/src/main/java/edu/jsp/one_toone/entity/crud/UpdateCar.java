package edu.jsp.one_toone.entity.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.one_toone.entity.Car;
import edu.jsp.one_toone.entity.Engine;

public class UpdateCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("one_toone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=manager.find(Car.class, 2);
		if(car!=null) {
			
			car.setCost(16000);
			transaction.begin();
			manager.merge(car);
			transaction.commit();
		}
		else {
			System.out.println("Car not found");
		}
		
		Engine engine=manager.find(Engine.class, 2);
		if(engine!=null) {
			
			
			engine.setEname("fbb");
			transaction.begin();
			manager.merge(engine);
			transaction.commit();
		}
		else {
			System.out.println("Engine not found");
		}

	}

}
