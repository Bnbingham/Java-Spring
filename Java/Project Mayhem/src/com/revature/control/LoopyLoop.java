package com.revature.control;

public class LoopyLoop {
	
/*
 * If Statements 
 * 	if( <conditional> ){ <what to do if true> }
 * 	else if(<second conditional>){ <second condition> }
 * 	else{ <default condition> }
*/ 
  
	
/* 
 * Switch Cases
 * 	String, value, a char, a boolean, or enum *a set list of constant values held in a special class*
*/
	static String color;
	public static void whatColor(String color) {
		switch(color) {
			case "green":
				System.out.println("color is green");
				break;
			case "purple":
				System.out.println("color is purple");
				break;
			case "crimson":
				System.out.println("color is crimson");
				break;
			default:
				System.out.println("you chose...poorly");
				//doesn't add a default break
		}
	}
	
/*
 * For loops
 * 	for(a;b;c){<do something>}
 * 	a is variable declarations (counter); usually int i=0
 * 	b is the condition; continues to execute until false
 * c is the incramentor/decrementor  
*/
	
	public static void forLoop(int p) {
		for(int i=p;i>0;i--) {
			if(i==2) { 
				//break;
				continue; //breaks from running the rest of the block, runs the incramentor/decrementor and continues it's next case 
			}
			System.out.println(i);
		}
	}
	
/*
 *Enhanced for loop aka for each
 *	for (x?<Array or collection>){<do something>}
 *	good for moving through collections, arrays and iterables
 *	more CPU efficient
 *	no issues with index out of bounds - not size dependent
 *	good for access elements in one collection
 *	bad for adding and removing
*/
	
	static int[] myArray= {11,33,44,77,22,66,243};
	public static void forEach(int [] a) {
		for(int i:a) {
			System.out.println(i);
		}
	}
	
/*
 *While loops
 *	while(<condition>){<do something>}
 *
 * Do while loop
 * 	do{<do something>} while(<condition>)	
*/
	
	public static void whileLoop(int i) {
		while(i++<10) {
			System.out.println("boring");
		}
	}
	public static void doWhile(int i) {
		do {
			System.out.println("not so boring");
			i++;
		}
		while(i<10);
	}
	
	public static void main(String[] args) {
		whatColor("potato");
		forLoop(3);
		forEach(myArray);
		whileLoop(5);
		doWhile(7);
	}

/*
 *Conditionals
 *Logical operators
 *	< > <= >= != ==
 *	a|b - bitwise OR
 *	a||b - logical OR
 *	a&b - bitwise AND
 *	a&&b - logical AND
 *	== compare values of primitives
 *	.equals() - method inherited Object; all ref types have it; looking at content as opposed to the memory address 
*/
	
}
