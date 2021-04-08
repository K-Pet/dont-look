package org.howard.edu.lsp.assignment6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment6.integerset.IntegerSetException;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IntegerSetTest {

	@Test
	@DisplayName("Test for clear class")
	void testClear() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		int result = tester.length();
		tester.clear();
		result = tester.length();
		assertEquals(0, result);
	}

	@Test
	@DisplayName("Test for length class")
	void testLength() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		int result = tester.length();
		result = tester.length();
		assertEquals(4, result);
		
	}

	@Test
	@DisplayName("Test for equals class")
	void testEqualsIntegerSet() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		IntegerSet tester2 = new IntegerSet();
		tester2.add(1);
		tester2.add(2);
		tester2.add(3);
		tester2.add(4);
		Boolean result = tester.equals(tester2);
		assertEquals(true, result);
	}

	@Test
	@DisplayName("Test for contains class")
	void testContains() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		Boolean result = tester.contains(3);
		assertEquals(true, result);
	}

	@Test
	@DisplayName("Test for largest class")
	void testLargest() throws IntegerSetException {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		int result = tester.largest();
		assertEquals(4, result);
	}

	@Test
	@DisplayName("Test for smallest class")
	void testSmallest() throws IntegerSetException {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		int result = tester.smallest();
		assertEquals(1, result);
	}
	

	@Test
	@DisplayName("Test for add class")
	void testAdd() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		Boolean result = tester.contains(1);
		Boolean result2 = tester.contains(2);
		Boolean result3 = tester.contains(3);
		Boolean result4 = tester.contains(4);
		assertEquals(true, result);
		assertEquals(true, result2);
		assertEquals(true, result3);
		assertEquals(true, result4);
		
	}

	@Test
	@DisplayName("Test for remove class")
	void testRemove() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		tester.remove(4);
		Boolean result = tester.contains(4);
		assertEquals(false,result);
	}

	@Test
	@DisplayName("Test for union class")
	void testUnion() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		IntegerSet tester2 = new IntegerSet();
		tester2.add(2);
		tester2.add(4);
		tester2.add(6);
		tester2.add(8);
		tester.union(tester2);
		Boolean result = tester.contains(2);
		Boolean result2 = tester.contains(4);
		Boolean result3 = tester.contains(6);
		Boolean result4 = tester.contains(8);
		assertEquals(true, result);
		assertEquals(true, result2);
		assertEquals(true, result3);
		assertEquals(true, result4);
	}

	@Test
	@DisplayName("Test for intersect class")
	void testIntersect() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		IntegerSet tester2 = new IntegerSet();
		tester2.add(2);
		tester2.add(3);
		tester.intersect(tester2);
		IntegerSet result = tester;
		IntegerSet expectedresult = new IntegerSet();
		expectedresult.add(2);
		expectedresult.add(3);
		assertTrue(expectedresult.equals(result));
		
	}

	@Test
	@DisplayName("Test for diff class")
	void testDiff() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		IntegerSet tester2 = new IntegerSet();
		tester2.add(2);
		tester2.add(3);
		tester.diff(tester2);
		IntegerSet result = tester;
		IntegerSet expectedresult = new IntegerSet();
		expectedresult.add(1);
		assertTrue(expectedresult.equals(result));
	}

	@Test
	@DisplayName("Test for is empty class")
	void testIsEmpty() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		Boolean result = tester.isEmpty();;
		assertEquals(false, result);
	}

	@Test
	@DisplayName("Test for to string class")
	void testToString() {
		IntegerSet tester = new IntegerSet();
		tester.add(1);
		tester.add(2);
		tester.add(3);
		tester.add(4);
		String result = tester.toString();
		assertNotSame(tester, result);
	}

}
