package com.revature;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.models.Coach;

public class SpringDriver {
	public static void main(String[] args) {
		System.out.println("creating bean container...");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("bean container created");
		System.out.println("Requesting coach bean");
		
		//Retrieve a bean from the spring container
		Coach coach=context.getBean("myCoach", Coach.class);
		//Call getDaily workout on the retrieved bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getMotivation());
	}
}
