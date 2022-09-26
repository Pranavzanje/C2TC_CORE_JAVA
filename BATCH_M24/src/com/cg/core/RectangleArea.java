package com.cg.core;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 String original;
		System.out.println("Enter the length=");
		double length = sc.nextDouble();
		
		System.out.println("Enter the width=");
		double width = sc.nextDouble();

		double area= length*width;
		
		System.out.println("Area of Rectangle=" +area);
		
	}

}
