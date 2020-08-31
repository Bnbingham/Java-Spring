package com.aop.model;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Revature
 *
 *	stereotypes- annotations that tell spring the class is
 *			going to be a spring bean (instances that spring
 *			is going to manage for us)
 *
 *	@Component
 *	@Service
 *	@Repository
 *	@Controller
 *	@RestController
 *	@Configuration
 *
 */

@Component
public class Singer {

	public int singSong() {
		System.out.println("koombaya");
		return 360;
	}
	
	public int singHard() {
		System.out.println("A POP SONG, AAAAAAHHHHHHHHH!!!!!");
		return 720;
	}
	
	public void singOceanMan() {
		System.out.println("rocket man");
	}
	
	public void yellAtAssociates() {
		System.out.println("WAKE UP AND TELL ME WHAT TO SING!!!!");
	}
	
	public int yellAtRobert() {
		System.out.println("WE DONT NEED NO EDUCATION!!!");
		return 180;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
