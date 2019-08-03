package com.example.firstSpringApp;

import org.springframework.beans.factory.annotation.Value;

public class Car implements Vehicle{

	
	private Engine engine;
	
	@Value("sedan")
	private String model;
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Car(){
		System.out.println("car constructor");
	}
	
	public void start(){
		engine.startEngine();
		
	}
	
}
