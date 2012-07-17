package com.joragupra.testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;
import static org.mockito.Mockito.*;

/**
 * Unit test for SortAlgorithm.
 */
public class SortAlgorithmTest extends TestCase {
	/**
	 * Rigourous Test :-)
	 */
	public void testAlgorithm() {
		List<String> aList = new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		SortAlgorithm sortAlg = mock(SortAlgorithm.class, CALLS_REAL_METHODS);
		doReturn(-1).when(sortAlg).compare(anyString(), anyString());
		List<String> anotherList = sortAlg.sort(aList);
		System.out.println(anotherList);
		assertEquals(aList, anotherList);
	}
	
	public void testAsc() {
		List<String> aList = new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		SortAlgorithm sortAlg = new SortAscending();
		List<String> anotherList = sortAlg.sort(aList);
		System.out.println(anotherList);
		assertEquals(aList, anotherList);
	}
	
	public void testDesc() {
		List<String> aList = new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		SortAlgorithm sortAlg = new SortDescending();
		List<String> anotherList = sortAlg.sort(aList);
		System.out.println(anotherList);
		Collections.reverse(aList);
		assertEquals(aList, anotherList);
	}
}
