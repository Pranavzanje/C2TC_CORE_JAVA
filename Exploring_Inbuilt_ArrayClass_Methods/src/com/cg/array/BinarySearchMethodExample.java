package com.cg.array;

import java.util.Arrays;

public class BinarySearchMethodExample {

	public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int result = Arrays.binarySearch(arr,key);  
        if (result < 0)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+result);  


	}

}
//Searches for the specified element in the array with the help of 
//the Binary Search Algorithm