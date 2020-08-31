package com.bingham.enthuwarestudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class UsingArrays {
	
	public static void main(String[] args) {
		ArrayAccessOrderOfOps.example();
	}

	static class loopingThroughArrays{
		static Object o = null;
		static Collection c = new ArrayList<Integer>(4);
		static int[][] ia = new int[2][2];
		static void example() {
			for(final Object o2:c) {
				//final is a valid modifier in a forEach loop				
			}
			for(int i[] : ia) {
				//ia must be represented as a valid array
				//(int i : ia[]) works too
				System.out.println(i[0]);
			}
		}
	}
	static class Print {
		// when creating array[length]
		// when accessing array[index], zero indexed
		// Arrays.toString prints the entire array with formatting
		static void array(int[][] array2d) {
			System.out.println("2D array");
			for (int[] accessRow : array2d) {
				System.out.println(Arrays.toString(accessRow));
			}
		}

		static void array(int[][][] array3d) {
			// array[page][row][column]
			int x = 0;
			for (int[][] accessPage : array3d) {
				System.out.println("3D array");
				System.out.println("page:" + x);
				if (x < array3d.length)
					x++;
				for (int[] accessRow : accessPage) {
					System.out.println(Arrays.toString(accessRow));
				}
				System.out.println();
			}
		}
	}
	static class ArraysVsArrayList{
		//arrays consume less memory 
		//accessing arrays is faster, index vs method
	}
	static class CreateNonJaggedArrays {
		//int[10] iA does not work. number must be declared on object not ref
		// created arrays are given default values, 0 null false
		void example1() {
			// creating the array { {0,0,0,0}, {0,0,0,0} }
			int[][] a = new int[2][4];
			// or
			int[][] b = new int[2][];
			b[1] = new int[4];
		}

		void example2() {
			int[][] a = new int[4][];
			// because arrays are created from left to right [4][] create a valid array
			// int[][] a = new int[][4]; is invalid because it initiates a null array first
		}
	}

	static class PassByReferenceKinda {
		static void example() {
			int i = 1;
			int[] iArr = { 1 };
			incr(i);
			incr(iArr);
			System.out.println("i = " + i + "  iArr[0] = " + iArr[0]);
		}

		public static void incr(int n) {
			// primatives send their value ie. 1 on this case
			// does not affect i
			n++;
		}

		public static void incr(int[] n) {
			// arrays send their object ie. the address to iArr
			// alters iArr[0]
			n[0]++;
		}
	}

	static class ArrayAccessOrderOfOps {
		static void example() {
			//int[] a = null;  //this compiles but throws nullPointerException
			int[] a = { 1, 2, 3, 4 };
			int[] b = { 2, 3, 1, 0 };
			// expression left of brackets evaluate first before any part in the brackets
			System.out.println(a[(a = b)[3]]);
		}
	}

}
