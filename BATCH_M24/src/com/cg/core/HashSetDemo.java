package com.cg.core;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add("b");
		h.add("c");
		System.out.println(h);
		h.remove("b");
		System.out.println(h);
		
		h.clear();
		
	}

}
