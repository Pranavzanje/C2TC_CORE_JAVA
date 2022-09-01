package com.cg.inheritanceex;
class Bankloan
{  
void LoanAmount(){System.out.println("20000");} 
}
class Homeloan1 extends Bankloan{
	void Clientname() {System.out.println("pranav");}
}
class Personalloan extends Homeloan1{
	void InterestPL() {System.out.println("10%");}
	
}


public class InheritanceEx2 {

	public static void main(String[] args) {
		Personalloan i=new Personalloan(); 
		i.InterestPL(); 
		i.Clientname(); 
		i.LoanAmount(); 
		

	}

}
//When there is a chain of inheritance, it is known as multilevel inheritance.