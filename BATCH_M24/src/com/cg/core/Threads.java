package com.cg.core;

public class Threads {

	public static void main(String[] args) {
		MyThread obj= new MyThread();
		obj.start();
//		Thread 1
		
	for (int i=0; i<10; i++)
	{
		System.out.println("I am main thread");
	}
	}

}
class MyThread extends Thread
{ 
//	Thread 2
	
public void run() {
	for (int i=0; i<10; i++){
		System.out.println("I am my thread");
	}
	
	
	
}
}