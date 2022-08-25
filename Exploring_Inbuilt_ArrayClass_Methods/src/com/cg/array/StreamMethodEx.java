package com.cg.array;

import java.util.Arrays;

public class StreamMethodEx {

	public static void main(String[] args) {
		// Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        // To get the Stream from the array
        System.out.println("Integer Array: "
                           + Arrays.stream(intArr));

	}

}


//Returns a sequential stream with the specified array as its source.