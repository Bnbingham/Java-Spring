package com.revature.classtypes;
/*
 * class types are concrete, abstract & interface
 * Abstract Class 
 * 		Special class that can't be instantiated
 * 		Used to establish structure and improve code reusability
 * 		They must contain at least 1 abstract method
 * 		Can contain concrete methods, or methods with implementation
 * 		'Contract based'- abstract methods MUST be overridden in subclass
 * Interface Class
 * 		Defines what they must do, not how they should do it.
 * 		Characterized by behavior
 */
public abstract class Animal { 
	//abstract method
	public abstract void breathe();
}
