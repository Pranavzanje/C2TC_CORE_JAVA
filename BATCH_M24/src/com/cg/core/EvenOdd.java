package com.cg.core;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println("Entered number is an even number");
			
		}
		else
		{ System.out.println("Entered number is a odd number");
			
	}

}
}
