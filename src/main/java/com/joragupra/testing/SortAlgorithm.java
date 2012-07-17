package com.joragupra.testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Generic string sorting algorithm.
 */
public abstract class SortAlgorithm {
	public List<String> sort(List<String> unsortedList) {
		List<String> sortedList = new ArrayList<String>();
		Iterator<String> it = unsortedList.iterator();
		while(it.hasNext()){
			String element = it.next();
			boolean inserted = false;
			for(int i=0;!inserted && i<sortedList.size();i++){
				if(compare(sortedList.get(i), element)>0){
					sortedList.add(i, element);
					inserted = true;
				}
			}
			if(!inserted){
				sortedList.add(element);
			}
		}
		return sortedList;
	}
	
	/**
	 * Compares a to b and returns an integer.
	 * 
	 * @param a
	 * @param b
	 * @return Returned value is less than 0 if a precedes b. It's greater than
	 * 0 if b precedes a. Otherwise returns 0.
	 */
	protected abstract int compare(String a, String b);
}
