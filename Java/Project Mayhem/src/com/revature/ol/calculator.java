package com.revature.ol;

public class calculator {

	public static void main(String[] args) {
		Double x=2.1;
		Integer y=2;
		
		add(3,6);
		add(1.3, 4.5);
		add(4,5,6);
		add(1,2,3,4);
		System.out.println();
		add(x,y); //ints will fit inside a double without a problem, as if it has an inherint .00
		add(x.intValue(),(int)5.1,2); //casting to ints may lose precision
	}
	
	static int add(int a, int b) {
		System.out.print("This used overload 1: ");
		System.out.println(a+b);
		return a+b;	
	}
	
	static double add(double a, double b) {
		System.out.print("This used overload 2: ");
		System.out.println(a+b);
		return a+b;
	}
	
	static int add(int a, int b, int c) {
		System.out.print("This used overload 3: ");
		System.out.println(a+b+c);
		return a+b+c;
	}
	static int add(int ...a) {
		System.out.print("This used overload 4: ");
		int total=0;
		for(int i:a) {
			total+=i;
		}
		System.out.println(total);
		return total;
	}
	
	//(3, 6) calls first add method and returns 9
	//(1.3, 4.5) calls second add method and returns 5.8
	//(4,5,6) calls third add method and returns 15
}
