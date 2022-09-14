package com.cg.core;
import java.util.*;
public class GenericsDemo1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Pranav");  
		list.add("Thor");  
		//list.add(32);//compile time error  
		  
		String s=list.get(1);//type casting is not required  
		System.out.println("element is: "+s);  
		  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
		}  