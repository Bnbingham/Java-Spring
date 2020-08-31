package com.bingham.enthuwarestudy;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class DataTypes {
	//final variables must be initialized when object is created
	//garbage collection works after ALL references to an object are severed
	public static void main(String[] args) {
		Float a = Float.parseFloat("11.0");
		System.out.println(a);
	}
	static class CharStuff{
		static void charHashcode() {
			System.out.println(new Character('A').hashCode()); //returns 65
		}
		static void usingCharAtOnString() {
			String a = "hello";
			System.out.println(a.charAt('a')); //passed the hashcode for 'a' which is 97
			//throws indexOutOfBoundsException
		}
	}
	static class ValueRange{
		char cMax = Character.MAX_VALUE+0;  //-65535
		char cMin = Character.MIN_VALUE; //0
		byte bMax = Byte.MAX_VALUE;  //-128
		byte bMin = Byte.MIN_VALUE; //127
		static void minMaxOf(String className)  {
			try {
				Class c = Class.forName("java.lang."+className);
				Field f[] = c.getFields();
				for (Field field : f) {
					System.out.println(field.getName() +" " + field.get(""));
				}
			} catch (Exception e) {
				System.out.println("not a valid input");
			}
		}
	}
	static class BoxingManutia{
		static void addMethodIsPicky() {
			Double b = new Double(111); //an Double can take 111 in it's constructor
			ArrayList<Double> al = new ArrayList<>();
			al.add((double) 111); //the add() cannot autobox an int without it being cast first
		}
	}
	static class SimilarTypes{
		
		static void charAndInt() {
			System.out.println(((char)65) == 65);
		}
		static void implicitNarrowing(){
			//byte, char, short and int
		}
		static void floatAndDouble() {
			//floats need to be explicitly established by a trailing "f"
			float a = 100.0f;
			double b = 100.0;
		}
	}
	static class FormattingNumbers{
		int a = 1000000;
		int b = 1_000____000;
		//int c = 1,000,000; cannot format with ","
		int hex = 0xCAFE_BABE;
		float f = 9898_7878.333_333f; 
		int bin = 0b1111_0000_1100_1100;
	}
	static class ValidInitialization{
		String a;
		String b = this.toString();  //this refers to itself upon initialization
		Boolean c = new Boolean("TrUe");
		boolean d = Boolean.parseBoolean("true");
		//abstract int t; in abstract classes use final int t; instead
	}
	
}
