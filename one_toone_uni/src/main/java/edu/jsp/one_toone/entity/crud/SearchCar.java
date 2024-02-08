package edu.jsp.one_toone.entity.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.one_toone.entity.Car;
import edu.jsp.one_toone.entity.Engine;

public class SearchCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("one_toone");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=manager.find(Car.class, 2);
		
		Engine engine=manager.find(Engine.class, 2);
		
		if(car != null && engine !=null) {
			System.out.println("-----------------------------");
			System.out.println("Car id:"+car.getCarid());
			System.out.println("Car Model: "+car.getModel());
			System.out.println("Car Brand: "+car.getBrand());
			System.out.println("Car Price: "+car.getCost());
			System.out.println("Car Engine: "+engine.getEngid());

		}
		else {
			System.out.println("Car Not Found");
		}
		
	}

}
