package com.ArrayAndArrayList;

import java.util.Scanner;

public class LeftShiftArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Get the size of Array
		System.out.println("Enter the size of Array");
		int n= sc.nextInt();
		
		//Declare an Array
		int a[] = new int[n];
		
		//Get the array elements
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		//Get the Shift value
		System.out.println("Enter no.of times to be left shifted ");
		int k=sc.nextInt();
		sc.close();
		
		//print before shifting
		System.out.println("Elements before shift are");
		for(int e: a) {
			System.out.println(e);
		}
		
		//printing left shifted elements
		System.out.println("Elements after left shifted are");
		for(int i=k;i<n;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<k;i++) {
			System.out.println(a[i]);
		}

	}

}
