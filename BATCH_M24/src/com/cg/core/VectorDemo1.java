package com.cg.core;
import java.util.*; 
public class VectorDemo1 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<String>();  
		v.add("Pranav");  
		v.add("Thor");  
		v.add("Vishwajeet");  
		v.add("Ajay");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  