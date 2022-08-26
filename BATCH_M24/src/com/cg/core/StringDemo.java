package com.cg.core;
 public class StringDemo {
	 public static void main(String[] args) {
	 String s=new String("pranav");

	 System.out.println("Zanje");
//	 immutable
	 System.out.println(s);
	 
//	 StringBuffer s1=new StringBuffer("Pranav");
//	 a1.append("Zanje");
//	 mutable
//   System.out.println(s1);
	 
	 System.out.println(s.length());
	 
	 
	 String s1="HELLO FRIEND";
	 String lower=s1.toLowerCase();
	 System.out.println(lower);
	 
	 String upper=s1.toLowerCase();
	 System.out.println(upper);
	 
	 
	 System.out.println(s.substring(2)); // begin index --->start index will be included.
	 System.out.println(s.substring(2,4));//start index --->include.....end index --->exclude.
	 
	 }
 }
