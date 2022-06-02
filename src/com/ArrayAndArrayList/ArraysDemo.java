package com.ArrayAndArrayList;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		//1.get the size of the array
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size = sc.nextInt();
		
		//2.get the array values
		int arr[] = new int[size];
		System.out.println("Enter the array values");
		for(int index=0;index<size;index++) {
			arr[index] = sc.nextInt();
		}
		sc.close();
		//3.print the array elements
		System.out.println("Elements in the array are:");
		for(int ele : arr) {
			System.out.println(ele);
		}
		
		
		//4.print the even values in array
		System.out.println("The even numbers in the array are:");
		for(int even : arr) {
			if(even%2==0) {
				System.out.println(even);
			}
		}
		
		//5.print the  odd values in array
		System.out.println("The odd numbers in the array are:");
		for(int odd: arr) {
			if(odd%2!=0) {
				System.out.println(odd);
			}
		}
		
		//6.print even index numbers
		System.out.println("Number in the even index are");
		for(int index = 0;index<size;index=index+2) {
			System.out.println(arr[index]);
		}
		
		//7.print odd index numbers
		System.out.println("Number in the odd index are:");
		for(int index = 1;index<size;index=index+2) {
			System.out.println(arr[index]);
		}
	}

}
