package com.cg.core;
class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating biscuits...");}  
}  
class Cat extends Animal{  
void eat(){System.out.println("eating fish and rats...");}  
}  
class Lion extends Animal{  
void eat(){System.out.println("eating meat...");}  
}  

  
public class Polymorphism3 {

	public static void main(String[] args) {
		Animal a;  
		a=new Dog();  
		a.eat();  
		a=new Cat();  
		a.eat();  
		a=new Lion();  
		a.eat();
	}

}
