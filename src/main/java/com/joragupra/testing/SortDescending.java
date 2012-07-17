package com.joragupra.testing;

public class SortDescending extends SortAlgorithm {

	@Override
	protected int compare(String a, String b) {
		return -a.compareTo(b);
	}

}
