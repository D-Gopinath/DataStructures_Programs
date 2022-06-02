package com.ArrayAndArrayList;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		//Get Array Size
		System.out.println("enter array size");
		int n = sc.nextInt();
		
		//declare array
		int arr[] = new int[n];
		
		//get array elements
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		//declare min and max variable
		int min =arr[0];
		int max=arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("Max value is "+max);
		System.out.println("Min value is "+min);
		
	}

}
