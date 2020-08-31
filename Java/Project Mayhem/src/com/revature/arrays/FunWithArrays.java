package com.revature.arrays;

import java.util.Arrays;

public class FunWithArrays {
	
/*
 *Arrays
 *	Group of like-typed variables that are referred to by a common name
 *	fixed length, variable can be changed
*/

	public static void main(String[] args) {
		//int a; declared
		//int a=7; initialized
		
		
		int [] myArray= new int[6]; //declared int array with six data containers
		int [] chaosArray= {3,5,1,5,755,878,23,556,858}; //initialized
		chaosArray[5]=99; //can be overwritten, mutated or modified
		System.out.println(chaosArray[5]);
		
		for(int i=0;i<chaosArray.length;i++) {
			chaosArray[i]=chaosArray[i]*4;
		}
		for(int i:chaosArray) {
			System.out.println(i);
		}
		
		Arrays.sort(chaosArray);
		System.out.println(Arrays.toString(chaosArray));
		
		int [] testArr = {5};
		System.out.println(testArr); //this sends the reference address instead of the value
		System.out.println(Arrays.toString(testArr)); // this converts the reference to a string so it prints out.
		System.out.print("look here");
		System.out.println(testArr[0]);
	}
}