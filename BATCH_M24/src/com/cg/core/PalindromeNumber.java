package com.cg.core;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		  int r,sum=0,temp;    
		  System.out.println("Enter any number");
			Scanner sc=new Scanner(System.in);

			int n=sc.nextInt();
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

