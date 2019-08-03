package com.example.firstSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Test {
		public static void main(String[] args) {
			// UI html
			// spring DI and IOC
			// setter injection and setter injection
			
			// container ---> our java object
			// new
			// configuation ---> bean
			// com.pack1.Car --->car
			//   com.pack1.Bike --> bike
			// factory Car and bike
			// both car and bike object are created
			// scope --> singleton
			// beans are created
			System.out.println("before the container");
			ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
			System.out.println("after the container");
			Vehicle veh=(Vehicle)applicationContext.getBean("car123");
			veh.start();
			
			
			
			
			
			/*
			System.out.println(veh);
			
			veh=(Vehicle)applicationContext.getBean("bike");
			System.out.println(veh);
			
			veh.start();
			
			
			//Vehicle vehicle=new Bike();
			//vehicle.start();
			//SpringApplication.run(FirstSpringAppApplication.class, args);
		
*/		
		}
}
