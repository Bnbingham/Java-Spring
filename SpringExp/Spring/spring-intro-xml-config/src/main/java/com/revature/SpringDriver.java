package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.model.Coach;

public class SpringDriver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Creating bean container...");
		
		
		//Load the Spring config file
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean container created");
		System.out.println("Requesting coach bean");
		
		//Retrieve a bean from the spring container
		Coach coach=context.getBean("myCoach",Coach.class);
		//Call getDailyWorkout on the retrieved bean
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getMotivation());
		
	}

}
