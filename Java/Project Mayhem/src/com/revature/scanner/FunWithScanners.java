package com.revature.scanner;

import java.util.Scanner;

public class FunWithScanners {

	public static Scanner sc= new Scanner(System.in); //first create a scanner object
	//sc.next will print char up to the first whitespace
	//sc.nextLine print all input
	
	public static void main(String[] args) {
		String contents;
		System.out.println("what would you like to print?");
		contents = sc.nextLine();
		System.out.println(contents);
		
		
		System.out.println("What number would you like to print?");
		String a = sc.next();
		int b= 57+Integer.parseInt(a); //changes user input from String to a number, allows you to put negative numbers in
		System.out.println(a);
		
	}
}
