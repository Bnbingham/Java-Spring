package com.aop.model;

import org.springframework.stereotype.Component;

/**
 *
 * stereotype - designates classes that tell spring the class is going to be a spring bean
 * (instances that spring is going to manage for us)
 * 
 * @Component
 * @Service
 * @Repository
 * @Controller
 * @RestController
 * @Configuration
 * 
 **/
@Component
public class Singer {
	
	public int singSong() {
		System.out.println("song1");
		return 360;
	}
	public int singHard() {
		System.out.println("song2");
		return 720;
	}
	public void singOceanMan() {
		System.out.println("song3");
	}
	public void yellAssociates() {
		System.out.println("Wake up and tell me what to sing!!!");
	}
	public int yellAtRobert() {
		System.out.println("WE DON'T NEED NO EDUCATION!!!");
		return 180;
	}
	
}
