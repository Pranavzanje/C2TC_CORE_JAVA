package com.cg.p2;

import java.util.*;


 public class Myclass2{
	 public static void main(String[] args) {   
		 
		
		 
		 Double num;
	        Scanner sc= new Scanner(System.in);
	 
	        System.out.print("Enter a number: ");
	        num=sc.nextDouble();
	         
	        
	        Double square = num*num;
	        System.out.println("Square of "+ num + " is: "+ square);
	        
	        
	        Scanner sc1= new Scanner(System.in); //System.in is a standard input stream  
	        System.out.print("Enter a string: ");  
	        String str= sc1.nextLine();              //reads string   
	        
	        System.out.print("You have entered: "+str);  
	     ;    
	        int count = 0;   
	        
	            
	        //Counts each character except space    
	        for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);    
	    }    
	}   