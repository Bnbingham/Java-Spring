package com.revature.design;

/*
 * factor create and object without exposing creation logic to the client
 * 
 * use a factoru method to return a car model based on
 * what String is given
 * if the method is given a parameter of something besides
 * crv of civic, it will return null
 */
public class HondaFactory {
	public Car makeCar(String whatCar, String color) {
		if("civic".equals(whatCar)) {
			return new Car(2020,"Honda", color);
		}else if("crv".equals(whatCar)) {
			return new Car(2020,"crv",color);
		}
		return null;
	}
}
