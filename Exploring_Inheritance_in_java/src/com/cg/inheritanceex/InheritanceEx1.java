package com.cg.inheritanceex;
class loan
{  
void interest(){System.out.println("2%");} 
}
class homeloan extends loan{
	void interestHL() {System.out.println("5%");}
		

}

public class InheritanceEx1 {

	public static void main(String[] args) {
		homeloan i=new homeloan();  
		i.interestHL();  
		i.interest();  

	}

}
//When a class inherits another class, it is known as a single inheritance