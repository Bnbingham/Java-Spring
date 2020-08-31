package com.revature.vodoo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
	/*
	 *Reflection
	 *	A way for java to inspect itself at runtime
	 *	will break encapsulation!
	 *	Contains methods for runtime inspection of objects
	 *	-Class of object
	 *	-Fields
	 *	-Methods
	 *	-Constructors
	 *	This can include private members!
	 *	can modify and instantiate, call methods etc
	 *	java.lang.reflect
	 * 
	*/
	
	//Overrides the need to import something
	//Mainly used by frameworks(eliminate boilerplate code by using reflection)
	//Most likely will never write reflection
	
	public static void main(String[] args) {
		try {
			Class<?> c= Class.forName("javax.swing.JFrame");  //Warned that this might not work because it doesn't know if this is a Class
			System.out.println("Constructors:");
			Constructor<?>[] con= c.getConstructors(); //Import Constructor object
			
			for(int i=0;i<con.length;i++) {    	//Prints out all of the different constructors and their messages
				System.out.println(" "+con[i]);
			}
			System.out.println("Fields:");		//Prints out all the different fields. Shows that you are getting properties from parent
			Field f[] = c.getFields();
			for(int i=0;i<f.length;i++) {
				System.out.println(" "+ f[i]);
			}
			
			System.out.println("Methods:");
			Method[] m= c.getMethods();
			for(int i=0;i<m.length;i++) {
				System.out.println(" "+m[i]);
			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
