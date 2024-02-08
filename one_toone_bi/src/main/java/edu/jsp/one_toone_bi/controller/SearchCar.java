package edu.jsp.one_toone_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.one_toone_bi.entity.Car;
import edu.jsp.one_toone_bi.entity.Engine;



public class SearchCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("one_toone_bi");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=manager.find(Car.class, 1);
		
		if (car != null) {
            Engine engine = car.getEngine();
            System.out.println("------------------------");
            System.out.println("Car id: " +car.getCarid());
            System.out.println("Car Model: "+car.getModel());
            System.out.println("Car Brand: "+car.getBrand());
            System.out.println("Car Price: "+car.getCost());
            System.out.println("------------------------");
            
            if (engine != null) {
                System.out.println("Engine Details:");
                System.out.println("Engine ID: " + engine.getEngid());
                System.out.println("Engine Name: " + engine.getEname());
                System.out.println("Horsepower: " + engine.getHp());
            } else {
                System.out.println("No Engine details found for this car.");
            }
        } else {
            System.out.println("Car not found");
        }
		
	}

}
