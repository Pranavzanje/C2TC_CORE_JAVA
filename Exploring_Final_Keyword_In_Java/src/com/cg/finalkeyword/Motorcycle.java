package com.cg.finalkeyword;

public class Motorcycle {
	  final void run(){System.out.println("running");}  
	}  
	     
	class Honda extends Motorcycle{  
	   void run(){System.out.println("running safely with 100kmph");}  
	     
	   public static void main(String args[]){  
	   Honda honda= new Honda();  
	   honda.run();  
	}

}
//	If you make any method as final, you cannot override it.