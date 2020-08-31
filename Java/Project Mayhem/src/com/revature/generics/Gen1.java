package com.revature.generics;
	/*
	 *Using a type as a parameter
	 *Writing code that can handle different types of objects
	 *Use angle brackets <>  
	 *Allows us to ensure type safety
	 *Adds stability and reusabilty to our code
	 *Placeholder (T,E,?,etc.) - use instead of an explicit type
	 *	? is a wild card, generic in place when type is not defined
	*/
public class Gen1<T> {  //declare the type in angle brackets
	//declare an object of type T
	T ob;  //ob is not a Keyword just a reference
	
	//pass the constructor a reference to an object of type T
	Gen1(T o){
		ob=o;
	}
	//return on
	T getOb() {
		return ob;
	}
	//show the Type of T
	void showType() {
		System.out.println("Type of T is: "+ ob.getClass().getTypeName());  
	}
}
