package com.cg.stringex;

public class SplitExample {

	public static void main(String[] args) {
		String s1="java string split method by Pranav";  
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}
	}

}
//The java string split() method splits this string against given regular expression
//and returns a char array.