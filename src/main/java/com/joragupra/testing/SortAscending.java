package com.joragupra.testing;

public class SortAscending extends SortAlgorithm {

	@Override
	protected int compare(String a, String b) {
		return a.compareTo(b);
	}

}
