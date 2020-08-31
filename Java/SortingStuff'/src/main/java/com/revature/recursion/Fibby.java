package com.revature.recursion;

import java.util.ArrayList;

public class Fibby {
	static ArrayList<Integer> fibArray = new ArrayList<Integer>();
	/*
	 * Fibonacci Sequence 0,1,1,2,3,5,8,13,21,24,55 fn = fn-1
	 * 
	 * Iterative
	 * 
	 * Recursive
	 */

	public static void main(String[] args) {
		fibbyIterative(8);
		
		int maxNumber = 10;
		System.out.print("Fibonacci Series of "+maxNumber+" numbers: ");
		for(int i = 0; i < maxNumber; i++){
				System.out.print(fibonacciRecursion(i) +" ");
			}
	}

	public static void fibbyIterative(int input) {
		// use a loop
		int current = 1;
		int previous = 0;
		int pp = 0;
		for (int i = 1; i < input; i++) {
			System.out.print(current + ", ");
			pp = previous;
			previous = current;
			current = pp + previous;
		}
		System.out.println(current);
	}

	public static int fibonacciRecursion(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
		}
}
