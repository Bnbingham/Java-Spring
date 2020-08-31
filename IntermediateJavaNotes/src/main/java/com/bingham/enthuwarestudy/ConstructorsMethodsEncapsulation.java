package com.bingham.enthuwarestudy;

public class ConstructorsMethodsEncapsulation {
	// State from class instances, type from interface class and enum
	// Constructors from inheriting classes must invoke super(), either implicitly
	// or explicitly
	// When looking at overloading, remember to check Capitalization
	// Overloaded methods use most specific match first, generic last
	// Constructors cannot be final, they can take an instance of themselves as a
	// param
	// (long) b/d*3, long cast refers to b only
	public static void main(String[] args) {
		
	}

	static class ValidMethod {
		static void ValidMethod(int a) {
			// invalid constructor, valid method
		}
	}

	static class UsingSuper {
		static class InMethods {
			static class A {
				int max(int x, int y) {
					//takes in B's params, returns to C's max()
					if (x > y)
						return x;
					else
						return y;
				}
			}

			static class B extends A {
				int max(int x, int y) {
					//first takes in new params from C then passes them to A's max()
					//after A returns, evaluate the rest of the equation and return to C
					return 2 * super.max(x, y);
				}
			}

			static class C extends B {
				int max(int x, int y) {
					//evaluates the super.max() before anything else
					//sends modified params to class B's max method
					//After B returns, returns to program
					return super.max(2 * x, 2 * y);
				}
			}

			public static void example() {
				B c = new C();
				System.out.println(c.max(10, 20));  //prints 80
			}
		}
	}

	static class WrapperConstructors {
		// Wrapper classes have built-in constructors for data types equal to or smaller
		// than them
		byte a = 9;
		short b = 9;
		int c = 9;

		Byte a1 = new Byte(a);
		Byte a2 = new Byte((byte) b);
		Byte a3 = new Byte((byte) c);
		Byte a4 = new Byte((byte) 9); // Primitives considered integers until cast
		Short b1 = new Short(a);
		Short b2 = new Short(b);
		Short b3 = new Short((short) c);
		
		//parseNumber always takes a string
		Float f = Float.parseFloat("11");

	}
}
