package com.revature.services;

public class MotivationServiceImpl implements MotivationService{

	
	public MotivationServiceImpl() {
		super();
		System.out.println("In MotivationServiceImpl noArgs constructor");
	}
	@Override
	public String getMotivation() {	
		return "Don't quit. Suffer now and code the rest of your life like a boss";
	}

}
