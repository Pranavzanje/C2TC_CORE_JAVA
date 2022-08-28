package com.cg.stringex;

public class ReplaceExample {

	public static void main(String[] args) {
		String s1="My name is pranav";  
		String replaceString=s1.replace('a','e');//replaces all occurrences of 'a' to 'e'  
		System.out.println(replaceString); 

	}

}
//The Java String class replace() method returns a string replacing all the old char or 
//CharSequence to new char or CharSequence.