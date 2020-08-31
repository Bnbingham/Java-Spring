package com.revature.collection;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyQueue {
	
	/*
	 *Ordered list focused on insertion order
	 *follows the FIrst-In-First-Out (FIFO) principle.
	 *
	 * Methods:
	 * 		poll, remove, peek and element
	 * 
	 * another structure is principle is First-In-Last-Out (FILO, LIFO), this is a stack
	*/
	
	public static void main(String[] args) {
		Queue<String> myFirstQueue = new LinkedList<>(); //this will import the Queue package
		Queue<Integer> myOtherQueue = new PriorityQueue<>(); //organizes in alphabetical order
		Queue<String> myFinalQueue = new ArrayDeque<>(); //Not used very often
		
		myFirstQueue.add("Peter Pan");
		myFirstQueue.add("Marmaduke");
		myFirstQueue.add("Spawn");
		
		System.out.println(myFirstQueue); //will return null value if the collection is empty
		System.out.println(myFirstQueue.poll()); //finds the head of the queue and removes it, leaving a smaller queue/
		System.out.println(myFirstQueue.peek()); //returns the value of the head
		System.out.println(myFirstQueue.element()); //same as peek but throws an exception when collection is empty
		System.out.println(myFirstQueue.poll());
		//System.out.println(myFirstQueue.poll());
		//System.out.println(myFirstQueue.remove()); //reacts the same, removing the head, will throw an exception if the list is empty
		
		System.out.println(myFinalQueue.addAll(myFirstQueue));
		System.out.println(myFinalQueue);
		
		myFirstQueue.add(null); //can start typing and then use crtl + space to auto complete the variable
		System.out.println(myFirstQueue); 
		
		for(String i: myFirstQueue) {
			System.out.print(i+ " ");
		}
	}
}
