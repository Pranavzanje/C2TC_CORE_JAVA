package com.cg.core;

import java.util.Arrays;

public class DeepHashCode {

	public static void main(String[] args) {
		  // Get the Array
        int intArr[][] = { { 10, 20, 15, 22, 35 } };
  
        // To get the deep hashCode of the arrays
        System.out.println("Integer Array: "
                           + Arrays.deepHashCode(intArr));

	}

}
