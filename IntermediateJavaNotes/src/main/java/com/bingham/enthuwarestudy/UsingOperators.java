package com.bingham.enthuwarestudy;

public class UsingOperators {
	class NotesAboutOperators{
		//pre-evaluation inc/dec, --val and ++val, evaluate then assign
		//post-evaluation inc/dec, val-- and val++, assign then evaluate
		
		//when "new" all elements of an array are automatically initialized by default values
		
		//equals() checks instanceof and if values are equivilant
		
		//operator is the function + - % etc... operand is the input 3(operand) +(operator) 4(operand) = 
	}
	
	public static void main(String[] args) {
		ValidLogic.specialIf();

	}
	static class ValidLogic{
		//oops forgot to finish this one.
		static void specialIf() {
			
		}
	}
	static class danglingElseProblem{
		static void example(String args[]) {
			if (args[0].equals("open"))          
				if (args[1].equals("someone"))             
					System.out.println("Hello!");       
			//this dangling else belongs to the innermost if statement, regardless of intention
			else System.out.println("Go away "+ args[1]);
		}
	}
	static class CompoundOperators{
		static void multipleEquals() {
			//I don't get this fully
			int i = 0 ;       
			int[] iA = {10, 20} ;       
			iA[i] = i = 30 ;       
			//evaluate left-hand operand first iA[0[ = i = 30
			//evaluate operands before operation i=30; iA[0] = (i=30)
			System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i); //returns 30 20 30
		}
		static void example(String[] args) {
			//args from main method always get assigned a length of 0 if no args
			int k = m1(args.length);
			//evaluate left of compound operator, k=1
			//initalize values for right-hand side, k=1
			//evaluate right of operator from left to right, 3 + (1+1)
			k += 3 + ++k;
			System.out.println(k);	
		}
		
		static int m1(int i) {
			return ++i;
		}
	}
}
