package com.revature.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class mySet {
	
/*
 * Collection Framework 
 * 		(More library) provides interfaces and classes that allow developers to more easily manage groups of objects
 * 
 * Itterable > Collection
 * 		Set
 * 			HashSet
 * 				LinkedHashSet
 * 			SortedSet
 * 				NavigableSet
 * 				TreeSet
 * 		List
 * 			ArrayList
 * 			Vector
 * 		Queue
 * 			LinkedList
 * 			PriorityQueue
 * 
 * 
 
 * 
 * Advantages
 * 		reduce effort
 * 		increase performance
 * 		Encourage software reuse
 * 
 * But!
 * 		convert primitive values to objects
 * 		ints -> Integer
 * 		boolean -> Boolean
 * 		byte -> Byte
 * 
 * Set??
 * 	Doesn't allow duplicate objects
 *  Doesn't Guarantee insertion order
 *  Sets are equal if they contain the same elements 
 *  HashSet: maintains no order, stores in hash table, best performance
 *  LinkedHashSet: maintains insertion order, weaker performance
 *  TreeSet: Implements both hash and Linked, Maintains value order, very slow performance
 *  	can be used to determine if their are duplicate values in a collection of objects
*/
	public static void main(String[] args) {
		Set<String> myFirstSet = new HashSet<String>(); //Can't use Set class because it's an interface
		//could be HashSet<Stringt> myFirstSet = new HashSet<>(); leaving it as Set allows for less complexity, and more
		//Has to take in Wrapper class instead of primative datatypes
		myFirstSet.add("Hello there"); //.add is a common method from the Set interface
		myFirstSet.add("Peter Pan"); // order is not preserved, don't rely on the insertion order 
		myFirstSet.add(" ");
		System.out.println(myFirstSet.add("Peter Pan")); //returns false if the value already exists within the set
		
		System.out.println(myFirstSet);
		
		Set<String> myOtherSet = new HashSet<String>();
		myOtherSet.add("Spice Girls");
		myOtherSet.addAll(myFirstSet); //This is the standard way to concatenate two
		System.out.println(myOtherSet);
		myOtherSet = myFirstSet; // this will overwrite the set completely, by reference so other sets will change as well
		System.out.println(myOtherSet); //maintains
		
		Set<RandomObject> randomSet = new HashSet<>(); //could be <Object> but it's nice to be able to differentiate
		RandomObject rand1 = new RandomObject("Cameron");
		RandomObject rand2 = new RandomObject("Chad");
		
		randomSet.add(rand1);
		randomSet.add(rand2);
		
		System.out.println(randomSet);
		
		//TreeSet:
		Set<Integer> myFirstTreeSet = new TreeSet<>();  //Create a tree set
		//Set<Object> if you add strings to the Object class, 
		//it will throw an error because it doesn't know how to compare ints and strings even if they are both objects
		myFirstTreeSet.add(1);
		myFirstTreeSet.add(2);
		myFirstTreeSet.add(3);
		myFirstTreeSet.add(5);  //Naturally ordering system. You can create own comparators and ordering methods.
		myFirstTreeSet.add(4);
		System.out.println(myFirstTreeSet);
		
		Set<Object> myfinalSet = new HashSet<>();
		
		myfinalSet.add(42);
		myfinalSet.add("Good day");
		
		System.out.println(myfinalSet); //heterogeneous objects are allowed in HashSet<Object>
		
		Object myObject = new Object(); //myObject would gain all the base methods of the Object class, object tangent
		
		Set<Integer> myLinkedSet = new LinkedHashSet<>(); //LinkedSets preserve the order in which they are inserted
		myLinkedSet.add(72);
		myLinkedSet.add(107);
		myLinkedSet.add(15);
		
		System.out.println(myLinkedSet); //no easy way to retrieve a specific value from a set, no .get
		
	}
}
