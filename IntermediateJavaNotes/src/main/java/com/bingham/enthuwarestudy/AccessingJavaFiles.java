package com.bingham.enthuwarestudy;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.System.*;


public class AccessingJavaFiles {
	public final static void main(String[] args) {
	}

	static class ImportFromPackage {
		static java.util.Random rand = new java.util.Random();

		static void fullyQualifiedName() {
			System.out.println("this imports from the java.util.Random");
			System.out.println(rand.nextInt(10));
		}

		static void staticMembers() {
			// can import only the static members of a class with "import static"
			// MAX_VALUE variable from java.lang.Integer.MAX_VALUE
			// System class static members from java.lang.System.*
			out.println(MAX_VALUE);
		}
	}
	interface exampleInterfaceValue {
		// "types" can be inherited by Classes, Interface, Enums
		// Only classes can have state, and classes can only inherit state from one source
		// variables inherently public static final
		int interfaceValue = 10;
	}
	static class ImportFromInterface implements exampleInterfaceValue {
		static void finalValue() {
			System.out.println(interfaceValue);
		}
	}
}


