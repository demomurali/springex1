package com.example.firstSpringApp;

public class Bike implements Vehicle{

	
	private Engine engine;
	private String model;
	
	public Bike(String model, Engine engine){
		this.engine=engine;
		this.model=model;
	}
	
	
	
	public Bike(){
		System.out.println("bike constructor");
	}
	
	public void start(){
		engine.startEngine();
		
	}
}
