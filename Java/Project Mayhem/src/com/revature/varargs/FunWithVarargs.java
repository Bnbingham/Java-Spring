package com.revature.varargs;

public class FunWithVarargs {
/*
 *Variable Length Argument
 *	Method that will take a variable number of arguments
 *	"is using a vararg as a parameter" 
 *	Java automates and hides the process of creating and saving the values in an array prior to invoking the method
 *	Vararg must be the last argument
 *	Can be of any type
 *	Creates an array in the declared variable
*/
	
	public static void vaTest(int ... v) { //takes in a variable length of int arguments
		System.out.println("Number of args is: " + v.length);
		System.out.print("Contents: ");	
		for(int i:v) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		vaTest(8);
		System.out.println("\n");
		vaTest(1,4,2,65,34,2,4,6,4);
		System.out.println("\n");
		vaTest();
		
	}

}
