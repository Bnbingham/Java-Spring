package com.revature.strings;

public class FunWithStrings {
	/*
	 *Strings!
	 *This is not char or Character
	 *Fully qualified class name: java.lang.String
	 *String literal is 0+ characers; ex "" or String a="Roll Tide"
	 *concatenate Strings with + or .concat("something in here");
	 *ex "Hello" + "World"
	 *Strings are immutable
	 *String pool- collection of unique String literal in heap memory
	 *String API (Application Programming Interface) has utility methods
	 *
	 *String- has String pool, Immutable, thread safe(synchronized, checked out), fast
	 *StringBuilder- no String pool, Mutable, not thread safe(has it's own copy), fast
	 *StingBuffer- no String pool, Mutable, thread safe, slow because of thread safety
	*/
	public static void main(String[] args) {
		//String Literal
		String a= "Bear"; //This creates a new reference in the string pool.
		System.out.println(a.hashCode());
		a= a.concat(" Down"); //creates a new string. String is still there, a is just referencing something else
		System.out.println(a);
		System.out.println(a.hashCode());
		String b= "Bear";
		System.out.println(b.hashCode()); //b now refers to the same location as a, same hashCode(); return
		String c= "Bear"; //compiler is searching the string pool to see if it exists
		
		System.out.println(b.equals(c)); //== compares values, .equals(); compares references
		
		System.out.println(b==c);
		System.out.println("the character is: "+c.charAt(3)); //lots of methods for manipulating strings
		//StringBulider
		StringBuilder sb=new StringBuilder("Hey");
		sb.append(" there");
		System.out.println(sb);
		StringBuffer t= new StringBuffer("Woo");
		System.out.println(t.hashCode()); //points to a different place
		
	}

}
