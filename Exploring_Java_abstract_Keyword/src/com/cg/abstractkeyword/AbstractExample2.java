package com.cg.abstractkeyword;

abstract class MyVehicle
{  
    abstract void bike();  
      
    void car()  
    {  
        System.out.println("Car is running");  
    }  
      
}  
class Bajaj extends MyVehicle  
{  
  
      
    void bike() {  
        System.out.println("Bike is running");  
      
    }  
      
}  
public  class AbstractExample2 {

	public static void main(String[] args) {
	    Bajaj obj=new Bajaj();  
	    obj.bike();  
	    obj.car();  

	}

}
//Abstract class containing the abstract and non-abstract method