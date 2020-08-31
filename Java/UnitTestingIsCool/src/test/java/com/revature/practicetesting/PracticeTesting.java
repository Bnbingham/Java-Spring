package com.revature.practicetesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.revature.totest.TestThis;

class PracticeTesting {
	
	//create an instance of the class
	TestThis test = new TestThis();
	
	//create a test using the method
	//assert that the answer is what you expect it to be
	//Testing the expected behavior vs the actual behavior
	@Test
	void testConcate() {
		String result = test.concate("one", "two");
		assertEquals("onetwo", result);
	}
	@Test
	void testMultiply() {
		int result = test.multiply(2, 3);
		assertEquals(6, result);
	}
	
}
