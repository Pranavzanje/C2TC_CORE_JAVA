package com.cg.stringex;

public class StartsWithExample {

	public static void main(String[] args) {
		// input string  
		String s1="java string split method by pranav";    
		System.out.println(s1.startsWith("ja"));  // true  
		System.out.println(s1.startsWith("java string"));   // true  
		System.out.println(s1.startsWith("Java string"));  // false as 'j' and 'J' are different 

	}

}
//The Java String class startsWith() method checks if this string starts with the 
//given prefix. It returns true if this string starts with the given prefix; else returns false.