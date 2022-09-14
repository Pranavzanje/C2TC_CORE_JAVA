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
	}

}