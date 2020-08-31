package com.bingham.enthuwarestudy;

import java.util.ArrayList;
import java.util.List;

public class HandlingExceptions {
	//exceptions break the current process and if not handled terminate the process
	//catch blocks "handle" exceptions
	public static void main(String[] args) {
		
	}
	static class CheckedExceptions{
		static void dontNeedToCatchThis() throws ArrayIndexOutOfBoundsException{
			//Since this is a RuntimeException
			//methods calling this do not need to declare or catch
			throw new ArrayIndexOutOfBoundsException();
		}
		static void needToCatchThis() throws Exception {
			//Since this is an Exception
			//methods calling this need to declare or catch
			throw new Exception();
		}
		@SuppressWarnings("serial")
		//checked exceptions need to be handled or declared in method signature
		class MyCheckedException extends Exception {}
		public void m1() throws MyCheckedException{
		      throw new MyCheckedException();
		   }
		   public void m2() throws RuntimeException{
		      throw new NullPointerException();
		   }
		static void declareOrCatch() {
			CheckedExceptions ce = new CheckedExceptions();
			try {
				ce.m1();
			} catch (MyCheckedException e) {
				//ce.m1(); m1 is a checked exception
				
				/* To be handled, AKA try/catch block
				 * try{ 
				 * 	ce.m1(); 
				 * } catch (MyEception e1){
				 * 	e1.printStackTrace(); //printStackTrace is a convenience method of Throwable
				 * }
				 */

				/* To be declared in method signature
				 *  static void example() throws MyCheckedException{ ... }
				 */
				
			} finally {
				ce.m2(); //m2 is a RuntimeException AKA unchecked exception
			}
		}
	}
	
	static class UncheckedExcpetions{
		//JVM will always print stack trace for unchecked exceptions
	}
	static class CatchOrder{
		//exceptoins can have multiple catch blocks with specific exception objects in each
		//if a subClass is above a superClass the code will not compile
		//unreachableCodeError
	}
	static class SpottingOutofMemory{
		void example1() {
			//no way to break out of the while loop.
			List s1 = new ArrayList( );            
			while(true){                 
				s1.add("sdfa");             
				}
		}
	}
	static class WorkingWithFinally{
		@SuppressWarnings("finally")
		static float unreachableCode( String s ){
		     float f = 0.0f;
		     try{
		          f = Float.valueOf( s ).floatValue();   
		          return f ;     
		     }
		     catch(NumberFormatException nfe){
		        f = Float.NaN ;    
		       return f;    
		     }
		     finally {
		         return f;    
		     }
		     //return f ; //compilation error: unreachable code
		 }
		
		static class NewException extends Exception {} 
		static class AnotherException extends Exception {}
		
		@SuppressWarnings("finally")
		static void ignoreException() throws Exception {
			try {
				throw new NewException();
			} finally {
				//newException is thrown but ignored because AnotherException is thrown after.
				throw new AnotherException();
			}
		}
	}
}
