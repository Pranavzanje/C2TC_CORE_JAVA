package com.cg.array;

import java.util.Arrays;

public class SpliteratorMethodEx {

	public static void main(String[] args) {

		  
        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        // To sort the array using normal sort
        System.out.println("Integer Array: "
                           + Arrays.spliterator(intArr, 1, 3));

	}

}

//Returns a Spliterator covering all of the specified Arrays.