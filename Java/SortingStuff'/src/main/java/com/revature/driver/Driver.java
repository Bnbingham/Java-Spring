package com.revature.driver;

import java.util.Arrays;

public class Driver {
	
	public static void main(String[] args) {
		bubbleSort(setUpMess());
		
	}
	public static int[] setUpMess() {
		int [] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i]=array.length-i;
		}
		return array;
	}
	public static int[] bubbleSort(int [] a) {
		int counter=1;
		int passes=1;
		int temp = 0;
		for(int j=0; j < a.length-1; j++) {  //-1 because you know after the first sort will always move the largest number to the end of the list on the first sort
			passes++;
			for (int i = 0; i < a.length-i-1; i++) { //remember -i-1 to shorten the length of the the array to search over
				counter++; 
				if (a[i]>a[i+1]) {
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					System.out.println(Arrays.toString(a));
					
				}
				
			}
		}
		System.out.println("Counter: "+counter+"\nPasses: "+passes);
		
		return a;
	}
	

}
