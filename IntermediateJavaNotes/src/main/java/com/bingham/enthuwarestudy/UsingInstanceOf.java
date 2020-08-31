package com.bingham.enthuwarestudy;

public class UsingInstanceOf {
	// binary operator, returns true/false
	// Object instanceof Type
	// instance must reference an object
	// Class must be a class, interface or enum

	public static void main(String[] args) {

	}

	static class ErrorsAndExceptions {
		static void compileTimeClass() {
			// instanceof looks at reference type at compile time
			// Object of class Date cannot be an instanceof class String
			// java.lang.String a = "";
			Object a = "";
			Boolean b = (a instanceof java.util.Date);
			System.out.println(b);
		}

		interface SampleInterface {
		}

		static class ClassWithoutInterface {
		}

		static void compileTimeInterface() {
			// compile time doesn't check interface types
			ClassWithoutInterface without = new ClassWithoutInterface();
			if (without instanceof SampleInterface) {
				System.out.println("Compiles file, returns false");

			}

		}
	}

	

	static class BasicRules {
		static void anyObjectVsObject() {
			String a = "";
			if (a instanceof Object)
				System.out.println("always true");
		}

		static void nullVsAny() {
			// instanceof has built-in notNull checks
			String a = null;
			if (a instanceof Object)
				System.out.println("always false");
		}

		static void equivilantNotRelated() {
			Integer a = 10;
			int b = 10;
			// eqauls can be overriden by any class
			System.out.println(a.equals(b)); // returns true
			// (b instanceof Integer); would not compile
		}

	}
}
