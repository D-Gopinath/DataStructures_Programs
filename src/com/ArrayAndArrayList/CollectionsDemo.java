package com.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {

	public static void main(String[] args) {
		//Declare a ArrayList
		ArrayList<Integer> al= new ArrayList<>();
		
		//add elemrnts to ArrayList
		al.add(76);
		al.add(53);
		al.add(8);
		al.add(12);
		al.add(99);
		//Iterate elements in ArrayList
		System.out.println("ArrayList size is "+al.size());
		System.out.println("Elements in the ArrayList are");
		for(Integer ele:al) {
			System.out.println(ele);
		}
		//Finding min and max
		System.out.println("Min element is "+Collections.min(al));
		System.out.println("Max element is "+Collections.max(al));
		
		//sorting the ArrayList in ascending order
		Collections.sort(al);
		System.out.println("Sorted in Ascending Order");
		for(int e:al) {
			System.out.println(e);
		}
		//sorting in descending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("After Sorting in descending order");
		for(int i:al) {
			System.out.println(i);
		}
		
		
	}

}
