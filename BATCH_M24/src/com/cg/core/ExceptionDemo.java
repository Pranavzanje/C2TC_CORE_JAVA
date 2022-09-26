package com.cg.core;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
		System.out.println(5+5);
		System.out.println(2/0);//exception
		System.out.println(3);
	}
   catch (ArithmeticException e)
   {
	System.out.println(2/2);//1
	System.out.println("Inside catch block");
}
finally // Privileged block
   {
	   System.out.println("I am finally block");
   }
   System.out.println("I am the remaining code");
}
}