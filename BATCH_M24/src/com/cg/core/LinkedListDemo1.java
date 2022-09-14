package com.cg.core;
import java.util.*;
public class LinkedListDemo1 {
	public static void main(String args[]){ 
	LinkedList<String> al=new LinkedList<String>();  
al.add("Pranav");  
al.add("Thor");  
al.add("Pranav");  
al.add("Thor");  
Iterator<String> itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  


