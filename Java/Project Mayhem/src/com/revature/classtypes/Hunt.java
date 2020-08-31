package com.revature.classtypes;
/*
 * Interface
 * 		Special type of class that cannot be instantiated
 * 		Specify what a class must do, not how it does it.
 * 		They lack instance variables
 * 		Can mimic multiple inheritance w/ interfaces
 * 		Classes can implement interfaces 0+
 * 		Interfaces can extend other interfaces 0+
 *		All variables are implicitly static, public and final (Java 8)
 *		Implicitly public and abstract
 */
public interface Hunt {
	void findPrey();
}
