package com.cg.core;
import java.util.Scanner;
public class UserDefinedEXC {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter the age");
		Scanner s=new Scanner (System.in);
		age =s.nextInt();
		
		if (age<18) {
			throw new CantVote ("You can not vote as you are under 18 years of age!!!");
			
		}
		else
		{
			System.out.println("You can cast your vote!!!");
		}
	}
}
class CantVote extends RuntimeException{
	CantVote(String msg)
	{
		super (msg) ;
	}
}