package com.revature.design;

public class Driver {
	private static HondaFactory hf=new HondaFactory();
	public static void main(String[] args) {
		Car cq=hf.makeCar("crv", "black");
		Car c2=hf.makeCar("potato", "browngreen");
		Car c3=hf.makeCar("potato", "clearbabypuke");
		System.out.println();
		System.out.println();
	}
	
}
