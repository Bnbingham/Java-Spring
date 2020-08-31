package com.revature.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;  //java.awt.List will stop it from importing

public class MyList {
	/*
	 * List
	 * 	A list is indexed
	 * 	Allows duplicates
	 * 	An ordered sequence
	 * 	part of "little c collections" maybe?	Not sure what they
	*/
	
	
	public static void main(String[] args) {
		
		List<String> myFirstList = new ArrayList<>();
		//Better at getting and setting
		myFirstList.add("We're doing great!!");
		myFirstList.add("We're doing great!!"); //duplicate values are allowed
		myFirstList.add("Here is another string");
		myFirstList.add("Another one for the road");
		System.out.println(myFirstList); //preserved by insertion position
		System.out.println(myFirstList.get(0)); //.get method from lists, can locate information easily from ArrayLists
		myFirstList.set(1, "Here is a new string"); //used to insert values into specific positions
		System.out.println(myFirstList);
		
		List<String> myOtherList = new LinkedList<>();
		//Better at adding and removing
		myOtherList.addAll(myFirstList);
		System.out.println(myOtherList.remove(1)); //.remove is available in each
		
		//Vectos allow for multiThreading, not sure what this means.
		//LinkedLists are not as common as ArrayList
		
		
		/*
		 *Array via index (positional access): interact with the elements based on their position in the ArrayList
		 * get, set, add, addAll, and remove
		*/
		//myOtherList.get(3); //retrieves value from the list located at the index
		myOtherList.set(1, "whatever value entered"); // sets the value at the index position to the value entered, can only add up to the defined size
		myOtherList.add("A string I'd like to add"); //adds the value onto the end of the list
		myOtherList.addAll(myFirstList); //must take in another collection
		myOtherList.remove(3); //removes value at index position and slides
		
		/*
		 * Search: find a specified object in the list and return its position:
		 * 	indexOf();
		 * lastIndexOf(); 
		*/
		System.out.println(myOtherList.indexOf("whatever value entered")); //if Object doesn't exist it'll return -1
		
		/*
		 *Range view methods:
		 *	sublist();
		*/
		System.out.println(myOtherList.subList(2, 3)); //(inclusive, exclusive) == (n, m-1)
	}

}
