package com.revature.wrappers;

public class Wrappers {

/*
 * Wrapper classes instantiates object without using new keyword
 * Character - char
 * Boolean - boolean
 * Byte - byte
 * Short - short
 * Integer - int
 * Long - long
 * Float - float
 * Double - double
*/
	
	static int myInt=3;
	static Integer myInteger=5;
	static Double myDouble=45.94;
	
	public static int addUp(int a, int b) {
		return a+b;
	}
	
/*
 * (Auto)boxing - implicit conversion from primitive type to wrapper class.
 * (Auto)unboxing - implicit conversion from wrapper to primitive type. 
 * Both boxing and unboxing are expensive processes
*/
	public static Integer multiplyThem(Integer a, Integer b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(addUp(myInteger, myDouble.intValue())); //unboxing
		System.out.println(multiplyThem(6,myInt)); //boxing
	}

}
