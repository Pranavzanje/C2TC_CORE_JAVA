package com.cg.array;

import java.util.Arrays;

public class DeepHashcodeEx {

	public static void main(String[] args) {
		// Get the Array
        int intArr[][] = { { 10, 20, 15, 22, 35 } };
  
        // To get the deep hashCode of the arrays
        System.out.println("Integer Array: "
                           + Arrays.deepHashCode(intArr));

	}

}

//Returns a hash code based on the “deep contents” of the specified Arrays.