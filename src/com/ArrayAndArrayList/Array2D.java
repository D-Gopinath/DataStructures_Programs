package com.ArrayAndArrayList;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Get No.of Rows and Columns
		System.out.println("Enter the row value");
		int row = sc.nextInt();
		
		System.out.println("Enter the column value");
		int col = sc.nextInt();
		
		//create a 2D array
		int a[][] = new int[row][col];
		
		//get the values
		System.out.println("Enter "+(row*col)+ " values");
		for (int i = 0; i < row ; i++) { 			 
			 for (int j = 0; j < col; j++) {				 
				 a[i][j] = sc.nextInt();
			 } 
		 }
		
		sc.close();
		
		//print the values in the matrix format
		System.out.println("Elements in matrix format");
		for (int i = 0; i < row ; i++) {  
			 for (int j = 0; j < col; j++) {
				 System.out.print(a[i][j]+" ");
			 }
			 System.out.println();	 
		 }

	}

}
