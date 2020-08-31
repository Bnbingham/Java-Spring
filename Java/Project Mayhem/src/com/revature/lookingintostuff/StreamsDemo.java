package com.revature.lookingintostuff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
	static List<Movie> movies = Arrays.asList(new Movie("a", 10), new Movie("b", 15), new Movie("c", 20));

	// imperative programming, how it should be executed
	public static void show1() {
		int count = 0;
		for (Movie movie : movies) {
			if (movie.getLikes() > 10)
				count++;
		}
		System.out.println(count);
	}

	// Declarative programming, what needs to be done
	// functional programming is a special type of declarative programming
	public static void show2() {

		int count = (int) movies.stream()
				.filter(movie -> movie.getLikes() > 10).count();
		System.out.println("count: "+count);

	}
	private static void show3() {
		Stream.of(1,2,3,4,5,6)
		.limit(3)
		.forEach(x -> System.out.print(x+" "));
	}
	private static void show4() {
		Stream.iterate(1,x -> x+1).limit(10).forEach(x -> System.out.print(x+" "));
	}

	public static void main(String[] args) {
		show4();
	}
}
