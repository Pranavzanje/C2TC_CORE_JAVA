package com.cg.inheritanceex;
class bankloan
{  
void interest(){System.out.println("2%");} 
}
class Homeloan1 extends bankloan{
	void interestHL() {System.out.println("5%");}
}
class Personalloan extends Homeloan1{
	void interestPL() {System.out.println("10%");}
	
}


public class InheritanceEx2 {

	public static void main(String[] args) {
		Personalloan i=new Personalloan(); 
		i.interestPL(); 
		i.interestHL(); 
		i.interest(); 
		

	}

}
//When there is a chain of inheritance, it is known as multilevel inheritance.