package com.example.firstSpringApp;

public class EngineImpl implements Engine{

	public EngineImpl(){
		System.out.println("inside the engine impl constructor");
	}
	
	@Override
	public void startEngine() {
		System.out.println("engine istartting tttrrrrrrrrrrrr");
	}

}
