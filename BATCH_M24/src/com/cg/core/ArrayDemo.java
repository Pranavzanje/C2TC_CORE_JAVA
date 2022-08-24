package com.cg.core;

public class ArrayDemo {

	public static void main(String[] args) {
	//	byte[] a= new byte [5];
		//System.out.println(a.getClass().getName()); 

		
		// Array 2D
		//int [][] x=new int[2][3];
		//System.out.println(x); // address
		//System.out.println(x[0]);// address
		//System.out.println(x[0][0]);// 0
		//System.out.println(x[0][1]);//0
		
		
		// Array 3D
		int [][][] a= {{{10,20,30},{40,50,60}},{{70,80},{90,100,110}}};
		System.out.println(a);// address
		System.out.println(a[0][1][2]);//60
		System.out.println(a[1][0][1]);//80
		System.out.println(a[1][2][0]);//error
		System.out.println(a[1][1][1]);//error
		System.out.println(a[2][1][0]);//error
	}

}
