package com.revature.strings;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class StringTest {
	
	private String str;
	//runs once before all other test, runs like a static
	@BeforeAll  
	static void beforeAll() {
		System.out.println("BeforeAll");
	}
	
	@BeforeEach
	void beforeEach(TestInfo info) {
		System.out.println("Initialize Test Data for "+ info.getDisplayName());
	}
	@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("Clean up Test Data for "+ info.getDisplayName());
	}
	

	@Test
	@DisplayName("We are checking the string length")
	void lengthCheck() {
		int actualLength="ABCD".length();
		int expectedLength=4;
		//assertEquals(expected value, actual value)
		assertEquals(expectedLength, actualLength);
	}
	
	@Test
	@DisplayName("Is it in here?")
	void contains_basic() {
		String str="abcdefg";
		boolean result = str.contains("ijk");
		//assertEquals(result,str); would return false
		assertFalse(result); //to help the code return true
		//the only thing that equals false is false in Java, not even -1
	}
	
	@Test
	@DisplayName("Check for exceptions")
	void lengthException() {
		String str = null;  //doesn't have a length, doesn't exist
		assertThrows(NullPointerException.class,
				()->{str.length();}				//passing in a function as a parameter
				);
//		assertEquals(3,str.length()); //not a failure in test, its an error because the method gives up trying to figure it out
	}
	
	
	//nest test together or create a subgroup of test
	@Nested
	@DisplayName("For empty string")   //can be used on classes as well
	class EmptyStringTests{
		@BeforeEach
		void setToEmpty() {
			str = "";
		}
		@Test
		void lengthIsZero() {
			assertEquals(0, str.length());
		}
		@Test
		void uppercaseIsEmpty() {
			assertEquals("",str.toUpperCase());
		}
	}

}
