package edu.jsp.one_toone_bi.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.one_toone_bi.entity.Car;
import edu.jsp.one_toone_bi.entity.Engine;

public class SearchEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("one_toone_bi");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Engine engine=manager.find(Engine.class, 1);
		
		
		if (engine != null) {
			Car car=engine.getCar();
            System.out.println("------------------------");
            System.out.println("Engine Details:");
            System.out.println("Engine ID: " + engine.getEngid());
            System.out.println("Engine Name: " + engine.getEname());
            System.out.println("Horsepower: " + engine.getHp());
           
            System.out.println("------------------------");
            
            if (car != null) {
                 System.out.println("Car Details:");
            	 System.out.println("Car id: " +car.getCarid());
                 System.out.println("Car Model: "+car.getModel());
                 System.out.println("Car Brand: "+car.getBrand());
                 System.out.println("Car Price: "+car.getCost());
            } else {
                System.out.println("No Car details found.");
            }
        } else {
            System.out.println("Engine not found");
        }

	}

}
