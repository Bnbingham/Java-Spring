package com.revature.models;

import com.revature.services.MotivationService;

public class FootballCoach implements Coach{

	private String email;
	private String team;
	private MotivationService motivationService;
	public FootballCoach() {
		super();
		System.out.println("In FootballCoach, no-args constructor");
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTeam() {
		return team;
	}


	public void setTeam(String team) {
		this.team = team;
	}
	
	public void customInit() {
        System.out.println("Inside of FootballCoach.customInit()...");
    }
    
    public void customDestroy() {
        System.out.println("Inside of FootballCoach.customDestroy()...");
    }


//	public MotivationService getMotivationServices() {
//		return motivateService;
//	}


	public void setMotivationService(MotivationService motivationServices) {
		this.motivationService = motivationServices;
	}


	@Override
	public String getDailyWorkout() {
		 return "Today's workout: Do suicide runs to the 40, 50, 60, 80, and 100 yard lines.";
	}

	@Override
	public String getMotivation() {
		return "The football coach says: " + motivationService.getMotivation();
	}
	
}
