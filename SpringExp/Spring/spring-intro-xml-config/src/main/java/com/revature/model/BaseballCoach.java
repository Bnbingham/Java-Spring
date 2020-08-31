package com.revature.model;

import com.revature.services.MotivationService;

public class BaseballCoach implements Coach{
	private MotivationService motivateService;
	
	public BaseballCoach() {
		super();
		System.out.println("Inside BaseballCoach, no-args constructor");
	}
	
	///Dependency injection (constructor based)
	public BaseballCoach(MotivationService service) {
		super();
		this.motivateService=service;
		System.out.println("Inside BaseballCoach, parameterized constructor");
	}

	@Override
	public String getDailyWorkOut() {
		return "Today's Workout: Spend 30 mins on batting practice";
	}

	@Override
	public String getMotivation() {
		return "The baseball coach says: "+motivateService.getMotivation();
	}
}
