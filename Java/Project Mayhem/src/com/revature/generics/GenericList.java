package com.revature.generics;

import java.util.Arrays;
import java.util.stream.Stream;

//allow for modular code with type safety
public class GenericList<T> {
	//start by declaring the Generic type <T> on the class method signature
	private T[] items = (T[]) new Object[10];
	private int count;
	
	public void add(T item) {
		items[count++] =item;
	}
	public T get(int index) {
		return items[index];
	}
	
	public static void main(String[] args) {
		//gets unkown types that come from the GenericList hierarchy
		GenericList<? extends GenericList> list =new GenericList<>();
		int[] a = {1,2,3,4};
		Arrays.stream(a)
			.forEach(n->System.out.println(n));
		Stream.of(1,2,3,4);
		Stream<Double> stream  = Stream.generate(() -> Math.random()); //lazy evaluation
		stream.forEach(n -> System.out.println(n));
		stream.close();
	}
}
