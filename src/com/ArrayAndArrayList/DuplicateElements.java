package com.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Get the size of the list
		System.out.println("Enter the size of list");
		int n = sc.nextInt();
		
		//create ArrayList
		ArrayList<Integer> al  = new ArrayList<Integer>();
		
		//Get the list values
		System.out.println("Enter the list values");
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		sc.close();
		
		//print the values
		System.out.println("List values are");
		for(int ele:al) {
			System.out.println(ele);
		}
		
		//Declare another list to store duplicate values
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		
		//sort the ArrayList
		Collections.sort(al);
		
		//Now iterate the ArrayList
		for(int i=0;i<al.size()-1;i++) {
			if((al.get(i)==al.get(i+1)) && (!duplicate.contains(al.get(i)))) {
				duplicate.add(al.get(i));
			}
		}
		
		//now print the duplicate elements
		System.out.println("Duplicate elements are ");
		for(int d:duplicate) {
			System.out.println(d);
		}

	}

}
