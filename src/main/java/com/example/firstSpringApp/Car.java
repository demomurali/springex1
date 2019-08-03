package com.example.firstSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Car implements Vehicle{

	// both byType and byName
	@Autowired
	private Engine engine1;
	
	@Value("luxury")
	private String model;
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine1() {
		return engine1;
	}

	public void setEngine1(Engine engine) {
		this.engine1 = engine;
	}

	public Car(){
		System.out.println("car constructor");
	}
	
	public void start(){
		System.out.println(this.model);
		engine1.startEngine();
		
	}
	
}
