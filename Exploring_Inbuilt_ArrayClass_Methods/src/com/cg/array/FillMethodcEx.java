package com.cg.array;

import java.util.Arrays;

public class FillMethodcEx {

	public static void main(String[] args) {
		// Get the Arrays
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        int intKey = 22;
  
        Arrays.fill(intArr, intKey);
  
        // To fill the arrays
        System.out.println("Integer Array on filling: "
                           + Arrays.toString(intArr));

	}

}
