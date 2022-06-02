package com.ArrayAndArrayList;

import java.util.Scanner;

public class RightShiftArray {

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
		System.out.println("Enter no.of times to be right shifted ");
		int k=sc.nextInt();
		
		sc.close();
		
		//print before shifting
		System.out.println("Elements before shift are");
		for(int e: a) {
			System.out.println(e);
		}
		
		//print the right shifted values
		for(int i=n-k;i<n;i++) {
			System.out.println(a[i]);
		}
		for(int i=0;i<n-k;i++) {
			System.out.println(a[i]);
		}
		

	}

}
