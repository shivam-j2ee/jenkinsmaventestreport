package com.simplilearn.project2;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class EvenOddTest {
	
	@Test
	public void testCheckEvenOdd() {
		EvenOdd e = new EvenOdd();
		assertTrue(e.checkEvenOdd(8));
	}
	
	@Test
	public void testCheckEvenOdd1() {
		EvenOdd e = new EvenOdd();
		assertFalse(e.checkEvenOdd(9));
	}

}
