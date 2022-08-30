package com.cg.abstractkeyword;
abstract class Vehicle  
{  
    abstract void bike();  
      
}  
class Honda extends Vehicle  
{  
  
   
    void bike() {  
        System.out.println("Bike is running");  
      
    }  
      
}  

public class AbstractExample1 {

	public static void main(String[] args) {
			  
		    Honda obj=new Honda();  
		    obj.bike();  
	}

}
//Abstract class containing the abstract method