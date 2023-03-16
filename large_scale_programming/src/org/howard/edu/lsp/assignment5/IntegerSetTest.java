package org.howard.edu.lsp.assignment5;
import org.howard.edu.lsp.assignment5.IntegerSet.IntegerSetException;
import org.junit.jupiter.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import junit.framework.TestCase;;

/**
 * Driver class to run test cases of IntegerSet class
 * @author LUly
 *
 */
public class IntegerSetTest extends TestCase{
		// TODO Auto-generated method stub
		IntegerSet set1;
		
		@BeforeEach
		protected void setUp() {
			set1 = new IntegerSet();
		}	
		
		@Test
		@DisplayName("Test case for function adding elements to set")
		public void testAdd() {
			setUp();
			Assertions.assertEquals(0, set1.length(), "Length should equal 0");
			set1.add(19);
			Assertions.assertEquals(1, set1.length(), "Length should equal 1");
			set1.add(10);
			set1.add(8);
			set1.add(89);
			Assertions.assertEquals(4, set1.length(), "Length should equal 4");
			set1.add(8);
			set1.add(10);
			Assertions.assertEquals(4, set1.length(), "Length should be equal to 4");
			set1.clear();
			Assertions.assertEquals(0, set1.length(), "Length should equal 0");
		}
		
		
		@Test
		@DisplayName("Test case for function removing elements from set")
		public void testRemove() {
			setUp();
			set1.add(10);
			set1.remove(1);
			Assertions.assertEquals(1, set1.length(), "Length should be 0");
			set1.add(3);
			set1.add(5);
			set1.add(8);
			set1.add(6);
			set1.remove(3);
			Assertions.assertEquals(3, set1.length(), "Length should 3");
			set1.remove(5);
			Assertions.assertEquals(2, set1.length(), "Length should be 2");
			set1.add(10);
			set1.remove(10);
			Assertions.assertEquals(2, set1.length(), "Length should be 2");
			set1.remove(8);
			set1.remove(10);
			Assertions.assertEquals(1, set1.length(), "Length should be 1");
		}
		
		@Test
		@DisplayName("Test case for function returning length of set")
		public void testLength() {
			setUp();
			Assertions.assertEquals(0, set1.length(), "Length should be 0");
			set1.add(2);
			set1.add(4);
			set1.add(6);
			set1.add(8);
			Assertions.assertEquals(0, set1.length(), "Length should be 4");
			set1.remove(2);
			set1.remove(4);
			Assertions.assertEquals(2, set1.length(), "Length should be 2");
			set1.clear();
			Assertions.assertEquals(0, set1.length(), "Length should be 0");
		}
		
		@Test
		@DisplayName("Test case for funciton removing all elements from set")
		public void testClear() {
			setUp();
			set1.clear();
			Assertions.assertEquals(0, set1.length(), "Length should be 0");
			set1.add(2);
			set1.add(4);
			set1.add(6);
			set1.add(8);
			Assertions.assertEquals(4, set1.length(), "Length should be 4");
			set1.clear();
			Assertions.assertEquals(0, set1.length(), "Length should be 0 after clear");
		}
		
		@Test
		@DisplayName("Test case for function checking if two sets are equal to each other")
		public void testEquals(){
			setUp();
			IntegerSet set2 = new IntegerSet();
			Assertions.assertEquals(true == set1.equals(set2), "Should be true since length of both is 0");
			set1.add(2);
			set1.add(4);
			set1.add(6);
			set1.add(8);
			Assertions.assertEquals(false == set1.equals(set2), "Should be false since set1 is diff than set2");
			set2.add(2);
			set2.add(4);
			set2.add(6);
			set2.add(8);
			Assertions.assertEquals(true == set1.equals(set2), "Should be true since they have the same elements");
			set2.add(10);
			Assertions.assertEquals(false == set1.equals(set2), "Should be false since set1 is diff than set2");
		}
		
		
		@Test
		@DisplayName("Test case for function checking if set contains an element")
		public void testContains() {
			setUp();
			Assertions.assertEquals(false == set1.contains(1), "Should be false - empty set");
			set1.add(2);
			set1.add(4);
			set1.add(6);
			Assertions.assertEquals(false == set1.contains(3), "Should be false - value not in set");
			Assertions.assertEquals(false == set1.contains(7), "Should be false - value not in set");
			Assertions.assertEquals(true == set1.contains(6), "Should be true - value 6 in set");
			Assertions.assertEquals(true == set1.contains(4), "Should be true - value 4 in set");

		}
		
		
		@Test
		@DisplayName("Test case for function finding largest val in set")
		public void testLargest() throws IntegerSetException{
			setUp();
			set1.add(2);
			Assertions.assertEquals(2 == set1.largest(), " Should be 2 - largest val in set ");
			set1.add(4);
			set1.add(6);
			Assertions.assertEquals(6 == set1.largest(), " Should be 6 - largest val in set ");
			set1.add(10);
			Assertions.assertEquals(10 == set1.largest(), " Should be 10 - largest val in set ");
		}
		
		@Test
		@DisplayName("Test case for largest() exception")
		public void testLargestException(){
			Assertions.assertThrows(IntegerSetException.class, () -> set1.largest());
		}
		
		@Test
		@DisplayName("Test case for function finding smallest val in set")
		public void testSmallest() throws IntegerSetException{
			setUp();
			set1.add(2);
			Assertions.assertEquals(2 == set1.smallest(), "Should be 2 - only val in set");
			set1.add(0);
			Assertions.assertEquals(0 == set1.smallest(), "Should be 0 - smallest val in set");
			set1.add(-2);
			Assertions.assertEquals(-2 == set1.smallest(), "Should be -2 - smallest val in set");
		}
		
		
		@Test
		@DisplayName("Test case for function for union of 2 sets")
		public void testUnion(){
			setUp();
			IntegerSet set2 = new IntegerSet();
			set1.add(2);
			set1.add(4);
			set1.add(6);
			set2.add(3);
			set2.add(5);
			set1.union(set2);
			assertEquals(set1,  new ArrayList<Integer>(Arrays.asList(2,3,4,5,6)));
			
		}
		
		
		@Test
		@DisplayName("Test case for intersect function of 2 sets")
		public void testIntersect() {
			setUp();
			IntegerSet set2 = new IntegerSet();
			set1.add(2);
			set1.add(4);
			set1.add(6);
			set2.add(4);
			set2.add(6);
			
			set1.intersect(set2);
			assertEquals(set2, new ArrayList<Integer>(Arrays.asList(4, 6)));
			
		}
		
		@Test
		@DisplayName("Test case for difference function")
		public void testDifference() {
			setUp();
			IntegerSet set2 = new IntegerSet();
			set1.add(2);
			set1.add(4);
			set1.add(6);
			
			set2.add(4);
			set2.add(6);
			
			set1.diff(set2);
			assertEquals(set1, new ArrayList<Integer>(Arrays.asList(2)));
			
		}
		
		
		@Test
		@DisplayName("Test case for function to empty the set")
		public void testEmpty() {
			setUp();
			assertTrue(set1.isEmpty());
		}
		
		
		@Test
		@DisplayName("Test case for toString function")
		public void testString() {
			set1.add(2);
			set1.add(4);
			set1.add(6);
			assertEquals(set1.toString(), "2, 4, 6");
		}
		
}

