package com.revature.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MyMap {
	
	/*
	 *Consists of key:value pairs rather than the index position
	 *	Each key must be unique, values don't have to be unique
	 *	If a key doesn't exist it will return null 
	*/
	
	/*
	 *Methods:
	 * Basic Methods-
	 * 		put, get, remove, containsKey, containsValue, size and empty
	 * Bulk Operations-
	 * 		putAll, clear
	 * Collection Views:
	 * 		keySet, entrySet, and values
	*/
	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new HashMap<>();
		/*
		 *Allows duplicate values, not duplicate keys
		 *Allows a single null, key, and it allows multiple values
		 *Does not guarantee order 
		*/
		Map<List<String>, List<String>> myOtherMap = new TreeMap<>();
		/*
		 *Does not allow null keys, but does allow null values.
		 *Sorted according to the natural ordering of the keys. 
		*/
		Map<Integer, String> myOtherOtherMap = new LinkedHashMap<>();
		/*
		 *It maintains insertion order 
		*/
		
		myMap.put(0, "This is my first value");
		myMap.put(42, "The answer to everything");
		myMap.put(21, "Today");
//		
//		This was trying to create lists using lists as keys
//		List<String> myKeyList = new ArrayList<>();
//		myKeyList.add("MyKey");
//		myKeyList.add("My Backup Key");
//		List<String> myValueList = new ArrayList<>();
//		myValueList.add("Here is my value list");
//		
//		myOtherMap.put(myKeyList, myValueList);
//		
		
		System.out.println(myMap);
		System.out.println(myMap.get(0));
		System.out.println(myMap.remove(21));
		System.out.println(myMap);
		
		System.out.println(myMap.keySet()); //returns all the keys associated with the collection
		System.out.println(myMap.values()); //returns the values associated with the collection
		
		myMap.put(42, null);
		myMap.put(null, "This is a null value");  
		System.out.println(myMap);
		
		System.out.println(myMap.size());//returns size of collection
		System.out.println(myMap.isEmpty());//returns boolean answer to the question "is it empty"
		
		
		myOtherOtherMap.put(42, "I'm not null"); //will be overwritten with add all
		myOtherOtherMap.putAll(myMap); // similar to putAll, adds submap into map
		System.out.println(myOtherOtherMap);
		
		myOtherOtherMap.clear(); //Clears all the entries in a map.
		System.out.println(myOtherOtherMap);
		
		//How to iterate through Maps
		Set<Integer> myKeySet = myMap.keySet(); //create a set
		for(Integer i: myKeySet) {
			System.out.println(myMap.get(i));
		}
//		for(int i: myMap.keySet()) {		//This one throws a "nullPointerException"
//			System.out.println(myMap.get(i));
//		}
		for(String myValues: myMap.values()) {
			System.out.println(myValues);
		}
		System.out.println();
		Set<Entry<Integer,String>> myPairs = myMap.entrySet(); //another way, find out what an Entry is
		for(Entry<Integer,String> i: myPairs) {
			System.out.println(i);
		}
		System.out.println(myPairs);
	}
}
