package com.bingham.enthuwarestudy;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class UsingJavaApi {

	public static void main(String[] args) {
		
	}
	static class AutoAssigned{
		//static and instance variables are assigned a value explicitly
		//local variables must be initialized before used
	}
	static class packageWithNoName{
		//if there is no package statement in the source file, the class is assumed to be created in an unnamed
		//package that has no name. This package cannot be inported in classed that belong to any other package at all
		//packages java, java.lang and java.io are always observable
		//package java.lang is always imported
	}
	static class TrickyCodeBlock{
		static void nullPlusCompile() {
			//null cannot be added to any data type except for strings.
			//System.out.println(null + true);    
			//System.out.println(true + null);     
			//System.out.println(null + null);
			System.out.println(null+" only strings"); //returns "null on strings"
		}
		static void example1(String args) {
			boolean hasParams = (args == null ? false : true);
			//looks like it's missing an else clause, but it doesn't need one or a ; to compile
			//There is no reason you can't include code snippits in currly brackets
			//"no params" prints as if it were an instance code block
			if(hasParams){
	            System.out.println("has params");
	        }{
	            System.out.println("no params");
	        }
		}
	}
	static class NamingVariables{
		String String = "String is not a keyword, just a class name";
	}
	static class DateAndTime {
		static void usingLocalDate() {
			//from java.time package
			// formatting or parsing using an invalid DateTimeFormatter throws an exception at run time
			// LocalDate does not have a Time arg and will throw errors if requested
			LocalDate a = LocalDate.parse("2015-01-01",DateTimeFormatter.ISO_DATE); //formatter not neccesary here
			System.out.println(a);
			System.out.println("Default format: " + LocalDate.now()); // default is ISO_DATE
			System.out.println(
					"Formatted: " + LocalDate.of(2013, Month.APRIL, 01).format(DateTimeFormatter.ISO_LOCAL_DATE));
			//runtime error for not including a time component in the string
			LocalDateTime b = LocalDateTime.parse("2015-01-01");

		}

		static void usingLocalTime() {
			System.out
					.println(LocalDateTime.of(2010, Month.OCTOBER, 01, 2, 15).format(DateTimeFormatter.ISO_DATE_TIME));
		}

		static public String getDateString(LocalDateTime ldt) {
			//LocalDateTime class does not contain Zone information
			return DateTimeFormatter.ISO_ZONED_DATE_TIME.format(ldt); //throws exception UnsupportedTemporalTypeException
		}

	}

	static class StringsAndBuilders {
		static void stringMethodsToKnow() {
			String a = "hello";
			a.charAt(1); // returns 'e'
			a.concat(" world"); //returns a new string
			a.intern(); //returns the hashcode of this string in memory
			a.contains("hell"); //boolean if string contains substring
			a.replace("hello", "Goodbye"); // creates new string with replacements
		}
		static void stringBuilderMethods() {
			StringBuilder sb = new StringBuilder("hello world");
			//to empty the contents of a stringbuilder
			sb.delete(0, sb.length());
		}
		static void nullStringArray() {
			int index = 1; 
			String[] strArr = new String[5]; 
			String   myStr  = strArr[index]; 
			System.out.println(myStr); //returns null because strings are instanciated as null objects in this case
		}
		//String, StringBuilder and StringBuffer are all final class's
		//All of their methods are implicitly final
		static void BuilderLength() {
			// setLength() will either truncate a string or populate with whitespace
			StringBuilder sb = new StringBuilder("12345678");
			sb.setLength(5);
			sb.setLength(10);
			System.out.println(sb.length()); // will return 10, string is "12345 "
		}
		static String hidePhone(String fullNumber) {
			//"520-331-3430"  substring(8) => "3430"
			//substring(where the cursor starts,where the cursor ends)
			//can append string to string builder with + operator
			return new StringBuilder("xxx-xxx-")+fullNumber.substring(8);
		}
	}
	static class UsingNumbers{
		//java.lang.Number is not a final class
		//Integer, Long, Double etc. extend Number
	}
	static class BooleanEquals{
		//will return false
		boolean a = Boolean.parseBoolean("TrUe") == new Boolean(null); //null returns false
		boolean b = new Boolean("TrUe") == new Boolean(true); //points to different objects
		boolean c = new Boolean("true") == Boolean.TRUE; //points to different objects
		boolean d = Boolean.parseBoolean("true"); //returns a boolean primative
	}
}
