package com.cg.core;

import java.util.Arrays;
import java.util.List;

public class WCODemo {

	public static void main(String[] args) {
		List<Integer> list1=Arrays.asList (12,25,52,48,76,8,9);
		List<Double> list2=Arrays.asList (12.5,45.2,1.3,45.2,5.6);
display(list1);
display(list2);
	}

	private static void display(List<?> list) {
		
		System.out.println(list);
		
	}

}
