package edu.jsp.one_toone.entity.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.one_toone.entity.Car;
import edu.jsp.one_toone.entity.Engine;

public class DeleteCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("one_toone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
	
		
		Car car=manager.find(Car.class, 1);
		if(car!=null)
		{
			transaction.begin();
			manager.remove(car);
			transaction.commit();
			
		}
		else {
			System.out.println("Car not found");
		}
//		Engine engine=manager.find(Engine.class, 1);
//		if(engine!=null)
//		{
//			transaction.begin();
//			manager.remove(engine);
//			transaction.commit();
//			
//		}
//		else {
//			System.out.println("Engine not found");
//		}
	}

}
