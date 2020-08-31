package com.bingham.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
 * TODO: get working examples of
 *	-method reference operator from custom class
 *	-toArray()
 *	-sorted()
 *	-reduce()
 */
public class FundamentalsOfStreams {
	// Streams are s wrapper class that allow you to perform bulk operations on the enclosed data in a declarative style
	// Some stream functions are "terminal operation" meaning the stream is considered consumed after it is performed
	void example() {
		Stream<?> a = Stream.of(1,2,3,4);
		a.forEach(x -> System.out.println(x));
	}

	// -----------------------Building a stream-----------------------
	// Declaring sample data pre-stream
	private static Integer[] myArray = { 1, 2, 3 };
	private static List<?> newList = Arrays.asList(myArray);

	// Creating a stream from an existing Array
	static Stream<?> myStream = Stream.of(myArray);

	// Creating a stream from an existing List
	Stream<?> streamFromList() {
		return newList.stream();
	}

	// Creating a stream from individual objects
	Stream<String> streamFromObjects(String... args) {
		return Stream.of(args);
	}

	// Creating a stream with the stream builder
	Stream<?> streamFromBuilder() {
		Stream.Builder<Integer> streamBuilder = Stream.builder();
		streamBuilder.accept(myArray[0]);
		streamBuilder.accept(myArray[1]);
		streamBuilder.accept(myArray[2]);

		return streamBuilder.build();
	}
	
	//function to demonstrate map()
	static String numToString(Integer number) {
		switch (number) {
		case 1: return "one"; 
		case 2: return "two";
		case 3: return "three"; 
		default: break;
		}
		return null;
	}

	public static void main(String[] args) {
		// ------------------------Operations with streams-----------------------
		// forEach() 
		Stream<String> stream1 = Stream.of("one ","two ","three ");
		System.out.print("forEach(): \n\tUsing a method reference operator:  ");
		stream1.forEach(System.out::print);

		
		// map() produces a new stream after applying a function to each element in the original
		// collect() is a common way of getting the new data from the stream after manipulating it
		Stream<Integer> stream2 = Stream.of(1,2,3);
		Object mappedList =  stream2
				.map(item -> numToString((Integer) item))
				.collect(Collectors.toList());
		System.out.println("\nmap(): \n\tMapped from Integer to String[]: " + mappedList);

		//filter() creates a new stream including only items that evaluate to true in the boolean provided
		Stream<Integer> stream3 = Stream.of(1,2,3);
		Object filteredList = stream3
				.filter(item -> (Integer)item < 3)
				.collect(Collectors.toList());
		System.out.println("filter(): \n\tFiltered result: " + filteredList);
		
	}
}
