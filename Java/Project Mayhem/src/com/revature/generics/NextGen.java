package com.revature.generics;

public class NextGen {

	public static void main(String[] args) {
		//Create a Gen1 Reference for Integers
		Gen1<Integer> i;
		i= new Gen1<Integer>(88);
		//Show type
		i.showType();
		//get value
		int v= i.getOb();
		System.out.println(i);//prints out fully qualified class name
		System.out.println("Value: "+ v +"\n");  
		
		Gen1<String> s= new Gen1<String>("Generics Test");
		s.showType();
		String str = s.getOb();
		System.out.println("Value: "+str);
		
		Gen1<Integer> a = new Gen1<>(77);
		s.showType();
		System.out.println("Value: "+a);
	}

}
