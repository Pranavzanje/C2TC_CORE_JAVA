package com.cg.core;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the size of your array:");
		Scanner s=new Scanner(System.in);
		size=s.nextInt ();
		
		int[] arr=new int [10];// create array

		System.out.println("Enter the elements of your Array:");
		
		for (int i=0; i<size; i++)
		{
			arr[i]=s.nextInt();// Taking input from the user
			
		}
		// printing the elements of array
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
