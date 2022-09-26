package com.cg.finalkeyword;

public class MotorCycle9 {
	 
		 int speedlimit=90;//final variable  
		 void run(){  
		  speedlimit=400;  
		 }  
		 public static void main(String args[])
		 {  
		 MotorCycle9 obj=new  MotorCycle9();  
		 obj.run();

	}

}
//If you make any variable as final, you cannot change the value of final 
//variable(It will be constant).