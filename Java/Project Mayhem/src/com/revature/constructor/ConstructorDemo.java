package com.revature.constructor;

public class ConstructorDemo extends D{

/*
 *Constructor
 *	Special method used to instantiate a class and create an object 
 *	No return type, returns object it creates
 *	
*/
	
	public static void main (String[] args) {
		System.out.println("in main");
		C c = new C();

	}

}
/*
 *Locates main class
 * extends> codeBlocksFromTopToBottom> staticBlocks
*/
//Demo of inheritance through the keyword "extends"
class A{
	static {System.out.println("A's static");}
	A(){
		System.out.println("inside of A's constructor");
	}
	{System.out.println("A's instance");}
}
class B extends A{ //"is-a" A and B
	B(){
		System.out.println("inside of B's constructor");
	}
	{System.out.println("B's instance");}
}
class C extends B{ //"is-a" A, B and C
	C(){
		System.out.println("inside of C's constructor");
	}
	static {System.out.println("C's static");}
}
class D{
	D(){
		System.out.println("inside of D's constructor");
	}
	static {System.out.println("D's static");}
	{System.out.println("D's instance");} // no instance in this code
}