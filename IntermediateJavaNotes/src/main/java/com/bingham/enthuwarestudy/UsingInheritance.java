package com.bingham.enthuwarestudy;

public class UsingInheritance {
	
	public static void main(String[] args) {
		
	}

	static class ConstructorsExample {
		// Non-static members can only be accessed by non-static class members
		// Static members can be accessed by any class member
		int nonStaticInstance = 10;
		static int staticInstance = 20;

		public static void staticPrint() {
			// System.out.println(nonStaticInstance); static method cannot access
			// nonStaticInstance
			System.out.println(staticInstance);
		}

		public void nonStaticPrint() {
			System.out.println(nonStaticInstance);
			System.out.println(staticInstance);
		}

		public String toString() {
			// Adding the ""+ is another way to cast a number to a String
			// return ""+this.nonStaticInstance
			return String.valueOf(this.nonStaticInstance);
		}

		public ConstructorsExample() { // constructors cannot be static abstract or final
			super(); // must include super(); or this() first
			int a = this.nonStaticInstance;
			int b = this.staticInstance;
		}
	}
	
	static class ChainingConstructors{
		String a;
		ChainingConstructors(){
			this("a simple example");
		}
		ChainingConstructors(String fromNoArgs){
			this.a = fromNoArgs;
		}
		//if you were to call ChainingConstructors() it would in turn call itself again but with a parameter
	}
	
	static class OverridingMinutia {
		static class OverrideAndNonAccessMod{
			//static method cannot be overridden by a non-static method and vice versa
			static public void m1() {};
		}
		static class TestingOverride extends OverrideAndNonAccessMod{
			static public void m1() {return;}; //this is overriding the method
		}
		static class IfNoOverrideInSub {
			static class Game {
				public void play() throws Exception {
					System.out.println("Playing...");
				}
			}

			static class Soccer extends Game {
				public void play(String ball) {
					System.out.println("Playing Soccer with " + ball);
				}
			}

			static void example() throws Exception {
				Game g = new Soccer();
				// the method being used must be owned by both the ref and the obj
				// Game g = new Soccer() cannot call play(String) but can call play() because the ref 
				//doesn't contain the method
				g.play();
				Soccer s = (Soccer) g;
				s.play("both the ref and obj contain this method");
			}
		}

		static class CantMakeMorePrivate {
			//from most restrictive to most accessable
			//private default protected public
			abstract class A {
				protected int m1() {
					return 0;
				}
			}

			class B extends A {
				//could be protected or public, but not default
//				 int m1() {  compile error because it needs access modifier >= its super method
//					return 1;
//				}
			}
		}
	}

	static class InheritanceRefPoints {
		static void boundAtRunTime() {
			class A {
			}
			;
			class AA extends A {
			}
			;
			A a = new A();
			AA aa = new AA();
			// A a is the reference type and variable
			// Reference often contains less than the object
			// new AA(); is the Object
			// Object contains all in the reference and often more
			// When casting, check Object>=refType then refType<=castType
			a = aa; // aa is-a a
			// AA bb = (AA) new A(); throws an error, illegal cast
			System.out.println("a = " + a.getClass());
			System.out.println("aa = " + ((A) aa).getClass()); // casting doesn't change it's class in memory this is AA
		}

	}

	static class Hiding {
		// instance methods are overridden and variables(and static methods) are hidden
		// Object type determines which instance methods are used
		// methods use an inherent "this." for variables
		// Reference type determines fields and static methods are used
		// ComplexClass cc = (ComplexClass) simpleReference, only if simpleReference
		// is-a ComplexClass
	}

	static class InterfaceAmbiguity {
		// Ambiguous fields or methods do not cause problems by themselves(exception
		// default methods)
		// The definitions will often resolve unambiguously
		interface T1 {
			// public final void compute(); final is an invalid modifier for interface
			// methods signatures
		}

		interface T2 {
			int VALUE = 10;

			void m1();
		}

		interface T3 extends T1, T2 {
			public void m1(); // will resolve with T2 to one reference point

			public void m1(int x);
		}

		static void accessingParents() {
			// if a class is private in a parent it can be accessed by specifying the cast
			// type.
			class A {
				public int i = 10;
				private int j = 20;
			}
			class B extends A {
				private int i = 30;
				public int k = 40;
			}
			class C extends B {
			}
			C c = new C();
			System.out.println(((B) c).i);
			System.out.println(((A) c).j);
			System.out.println(c.k);
		}
	}

	static class OverridingAndExceptions {
		// Overriding methods cannot throw an exceptions that is a super class
		// of the exceptions thrown by the overridden method
		// Can only throw sibling classes or children of the exceptions in parent
	}

	static class CovarientReturnTypes {
		// Overriding methods must have a covariant return type
		// Primitive types must match exactly
		// Objects can return the same class or a subclass(more specific)
	}

}
