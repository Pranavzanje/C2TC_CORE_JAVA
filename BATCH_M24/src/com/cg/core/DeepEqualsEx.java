package com.cg.core;

import java.util.Arrays;

public class DeepEqualsEx {

	public static void main(String[] args) {
		   // Get the Arrays
        int intArr[][] = { { 10, 20, 15, 22, 35 } };
  
        // Get the second Arrays
        int intArr1[][] = { { 10, 15, 22 } };
  
        // To compare both arrays
        System.out.println("Integer Arrays on comparison: "
                           + Arrays.deepEquals(intArr, intArr1));

	}

}
