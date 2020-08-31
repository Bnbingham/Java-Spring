package com.revature.iterate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
	/*
	 *Iterator
	 *  Anything that can be used as the subject of a for each loop uses an iterator
	 *  Aka they implement the iterable interface
	 *  Every collection has an iterator that allows traversal between elements
	 *  allows safe removal of elements in place
	 *  May never use iterator like this
	*/
	public static void main(String[] args) {
		//create an ArrayList
		List<String> a1= new ArrayList<String>(); //typical way to do it, maybe has something to do with type saftey, could be ArrayList<String> a1
		//add elements to it
		a1.add("B");
		a1.add("A");
		a1.add("D");
		a1.add("C");
		a1.add("E");
		a1.add("F");
		a1.add("G");
		//use the iterator to display the contents of a1
		System.out.println("Original contents of a1: ");
		Iterator<String> itr= a1.iterator(); //has properties to make it easier to iterate
		while(itr.hasNext()) {
			String element= itr.next();
			System.out.print(element + " ");
		}
		//Modify the objects that are being iterated
		ListIterator<String> litr= a1.listIterator();
		while (litr.hasNext()) {
			String element= litr.next();
			litr.set(element+ "+");
		}
		System.out.println("Modified contents of a1: ");
		itr=a1.iterator();
		while(itr.hasNext()) {
			String element= itr.next();
			System.out.print(element + " ");
		}
		//Display things backwards
		System.out.println("\nModified list Backwards: ");
		while(litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element+" ");
		}
	}

}
