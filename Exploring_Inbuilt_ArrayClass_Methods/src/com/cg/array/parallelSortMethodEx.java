package com.cg.array;

import java.util.Arrays;

public class parallelSortMethodEx {

	public static void main(String[] args) {

        // Get the Array
        int intArr[] = { 10, 20, 15, 22, 35 };
  
        // To sort the array using parallelSort
        Arrays.parallelSort(intArr);
  
        System.out.println("Integer Array: "
                           + Arrays.toString(intArr));
	}

}
// Sorts the specified array using parallel sort.