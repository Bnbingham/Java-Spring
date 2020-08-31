package com.bingham.enthuwarestudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsingLambdas {
	//java.util.function.Predicate is a functional interface with the method boolean test()
	
	public static void main(String[] args) {
		UsingPredicate.example();
	}
	static class SimpleExamples{
		static void runnableExample() {
			Runnable a = () -> System.out.println();
			new Thread(()->System.out.println("Hello")).start();
		}
		static void comparatorExample() {
			String[] nameArray = {"Brad","Cody","jarem","Lynell","kelly", "bren"};
			//Arrays.sort(nameArray, (a,b) -> a.compareToIgnoreCase(b));  //using lambda
			Arrays.sort(nameArray, String::compareToIgnoreCase); //using method reference
			//System.out.println(Arrays.asList(nameArray)); //println can print lists but not arrays
			//Stream.of(nameArray).forEach(System.out::print); //forEach on a stream
			Arrays.asList(nameArray).forEach(System.out::print); //forEach on a collection
		}
	}
	static class UsingPredicate{
		//Use Predicate class to define where you can use the test() lambda in your methods
		private static boolean checkList(List list, Predicate<List> p){
			//a1 of line 37-38 == list of line 32 maybe
			return p.test(list);    
		}
		
		static void example() {
			//add() method returns a boolean value
			boolean a = checkList(new ArrayList<>(), a1 -> a1.isEmpty());
			boolean b = checkList(new ArrayList(),a1 -> a1.add("Hello"));
			System.out.println(a);
			System.out.println(b);			
		}
	}
	static class OtherFunctionalInterfaces{
		//Comparator compare()
		//Compare compareTo()
		//Function
		//Predicate boolean test();
		//Consumer
		
	}
}
