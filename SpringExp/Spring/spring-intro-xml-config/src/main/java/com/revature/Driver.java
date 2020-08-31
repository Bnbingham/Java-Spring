package com.revature;

import com.revature.model.BaseballCoach;
import com.revature.model.Coach;
import com.revature.services.MotivationServiceImpl;

public class Driver {

	public static void main(String[] args) {
		Coach coach= new BaseballCoach(new MotivationServiceImpl());
		System.out.println(coach.getMotivation());
	}

}
