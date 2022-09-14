package com.cg.core;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
ArrayList l=new ArrayList();
l.add("Pranav");
l.add(21);
l.add(60);
l.add("A+");
System.out.println(l);
l.remove(2);
System.out.println(l);
l.add(0,"Mr");
System.out.println(l);
	String [] A=new String[500];
	A[0]="Alia";
	A[1]="Ranbir";
	A[2]="45";
	
	ArrayList <String> V=new ArrayList<String>();
	V.add("Alia");
	V.add("Ranvir");
//	V.add(45);
	
	System.out.println(V);
	}

}