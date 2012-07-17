package com.joragupra.testing;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class SortAlgorithmTest extends TestCase {
	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		List<String> aList = new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		SortAlgorithm sortAlg = new SortAlgormithmConcreteTestSubclass();
		List<String> anotherList = sortAlg.sort(aList);
		assertEquals(aList, anotherList);
	}
}
