package org.howard.edu.midterm.problem51;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.midterm.problem51.Range.EmptyRangeException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerRangeTest {

	IntegerRange range1;
	
	
	@BeforeEach 
	void setUp() throws Exception{
		range1 = new IntegerRange(20, 200);
	}
	
	
	@AfterEach
	void tearDown() throws Exception{
		range1 = null;
	}
	
	
	@Test 
	@DisplayName("Test case for getLower()")
	public void testgetLower() throws Exception {
		setUp();
		Assertions.assertEquals(range1.getLower(), 20);
	}
	
	@Test
	@DisplayName("Test case for getUpper(")
	public void testgetUpper() throws Exception {
		setUp();
		Assertions.assertEquals(range1.getUpper(), 200);
	}
	
	@Test
	@DisplayName("Test case for contains()")
	public void testContains() throws Exception {
		setUp();
		Assertions.assertEquals(range1.contains(80), true);
		Assertions.assertEquals(range1.contains(700), false);
		Assertions.assertEquals(range1.contains(-1000), false);
		Assertions.assertEquals(range1.contains(20), true);
	}
	
	@Test
	@DisplayName("Test case for overlaps()")
	public void testOverlaps() throws Exception{
		setUp();
		IntegerRange range2;
		range2 = new IntegerRange(40, 80);
		Assertions.assertEquals(range1.overlaps(range2), true);
		Assertions.assertEquals(range2.overlaps(range1), true);
		
		range2 = new IntegerRange(-10, 0);
		Assertions.assertEquals(range1.overlaps(range2), false);
		Assertions.assertEquals(range2.overlaps(range1), false);
	 
	}
	
	@Test
	@DisplayName("Test case for EmptyRangeException")
	public void testOverlapsException() {
		IntegerRange range2 = null;
		Assertions.assertThrows(EmptyRangeException.class, () -> range1.overlaps(range2));

	}
	
	@Test 
	@DisplayName("Test case for size()")
	public void testSize() throws Exception {
		setUp();
		
		assertEquals(range1.size(), 180);
		
		IntegerRange range2;
		
		range2 = new IntegerRange(0, 100);
		assertEquals(range2.size(), 100);
		
		range1 = new IntegerRange(1, 2);
		Assertions.assertEquals(range1.size(), 1);
	
	}
}
