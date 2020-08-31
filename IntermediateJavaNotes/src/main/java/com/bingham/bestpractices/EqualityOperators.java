package com.bingham.bestpractices;

public class EqualityOperators {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static class ReferenceVsLogical {
		static void example() {
			String strA = new String("eBay");
			String strB = new String("eBay");
			String strC = new String("Paypal");

			// Create a String reference and assign an existing String's reference to it
			// so that both references point to the same String object in memory.
			String strD = strA;

			// Print out the results of various equality checks
			// Reference Equality
			System.out.println("Reference Equality Result:");
			System.out.println(strA == strB); // false, pointing to different objects
			System.out.println(strA == strC); // false, pointing to different objects
			System.out.println(strA == strD); // true, point to the same object via address

			// Logical Equality
			System.out.println("\nLogical Equality Result:");
			System.out.println(strA.equals(strB)); // true, type and value match
			System.out.println(strA.equals(strC)); // false, type match but not value
			System.out.println(strA.equals(strD)); // true, type and value match
		}
	}

	static class OverrideHashAndEquals {
		 
		/*
		 * Hashing retrieval is a two-step process:
		 * 	Find the right bucket (using hashCode())
		 * 	Search the bucket for the right element (using equals() )
		 * 
		 * Best practices Use this == that to check reference equality Use instanceof to
		 * test for correct argument type Cast the argument to the correct type Compare
		 * significant fields for equality
		 */
		private class ExampleClass {
			private int value;

			ExampleClass(int val) {
				value = val;
			}

			public int getValue() {
				return value;
			}

			@Override
			public boolean equals(Object o) {

				// null check
				if (o == null) {
					return false;
				}

				// this instance check
				if (this == o) {
					return true;
				}

				// instanceof Check and actual value check
				if ((o instanceof ExampleClass) && (((ExampleClass) o).getValue() == this.value)) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public int hashCode() {
				int result = 0;
				result = (int) (value / 11);
				return result;
			}
		}

	}
}
