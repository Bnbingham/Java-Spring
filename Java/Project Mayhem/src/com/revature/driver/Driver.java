package com.revature.driver;

import java.util.Date;

import com.revature.beans.Human; //gains access to Human class
// import com.revature.beans.*  - imports everything in beans
// static import com.revature.beans.Human - gains access to only static members of class

public class Driver {
	
	//single comment

	/*
	 * Why Java? "WORA" Principle write once, run anywhere
	 * Owned by Oracle use to be owned by Sun Microsystem
	 * Industry standard version is 1.8 or "Java 8"
	 * 
	 * JVM - Java virtual machine
	 * 		converts complied java code into machine code for specific processor
	 * 		Provides portability
	 * JRE - Java runtime environment
	 * 		JVM + Libraries 
	 * 		Contains everything that we need to RUN Java
	 * JDK = Java Development Kit
	 * 		Contains the JVM + JRE
	 * 		Complier etc...
	 * 		Everything we need to WRITE Java
	 * 
	 * OOP - Object oriented programming
	 * 		unit of programmability is the object
	 * 		Objects - have states and behaviors
	 * 			States are properties, fields, attributes
	 * 			Behaviors are methods
	 * 		Classes - blueprint of an object  
	*/
	
	public static void main(String[] args) {
		
		
		Date d=new Date(); //when using ctrl+shift+O brings up multiple packages in which date exists
		java.sql.Date e=new java.sql.Date(0); //fully qualified names are required to designate between multiple similarly named classes
		//alias's do not exist in Java
		
		/*
		 * Method signature
		 * 		Access modifiers
		 * 			public - anything within the project or that references the project
		 * 			static - do not need to instantiate to use/belongs to the class
		 * 			void - specifies that the functions will not return anything
		 * 		Parameters
		 * 			String[] args - can accept an array of strings
		 */
		System.out.println("\u001B[36m"+"This Line is in cyan, not boring old white"+"\u001B[0m");
		Human i= new Human("Abid", 22, 200);
		Human h= new Human();
		System.out.println(i);
//		h.setName("Brad");
//		h.setAge(33);
//		h.setWeight(180);
		System.out.println(h);
//		System.out.println(h.getName());
		i.findPrey();
	}
	
}
