package com.revature.design;

public class Singleton {
	/*
	 * singleton design pattern
	 * 		won't do anything in this example
	 * 		one instance of a class and provides "global" access to it
	 * 		
	 */
	
	//private static instance of itself
	private static Singleton instance;
	
	//private constructor
	private Singleton() {
		//logic here
	}
	//Static method to get the unique instance
	//if it doesn't exist we create it
	//synchronized one reference instance of the object shared between all threads 
	public static synchronized Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	public void doSomething() {
		//logic what the object to do.
	}
	
}
