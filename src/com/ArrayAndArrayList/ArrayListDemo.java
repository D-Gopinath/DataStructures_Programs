package com.ArrayAndArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Creating An ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int n= sc.nextInt();
		System.out.println("Enter Values");
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			al.add(num);
		}
		sc.close();
		
		System.out.println("Size ->"+al.size());
		al.add(12);
		al.add(15);
		System.out.println("Size after add two values ->"+al.size());
		
		//iterating ArrayList using forEach loop
		System.out.println("Using ForEach Loop");
		for(Integer values : al) {
			System.out.println(values);
		}
		
		//iterating using for loop
		System.out.println("Using for loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		

	}

}
