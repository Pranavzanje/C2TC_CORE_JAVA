package com.cg.core;
import java.util.Arrays;
public class SortedArray {

	public static void main(String[] args) {
		
			int[] arr = {10,58,75,68,12,96,38,74,18,96};
			
				System.out.println("Entered array is=");
			for(int num:arr)
			{
				System.out.println(num+" ");
				
			}
			Arrays.sort(arr);
			System.out.println("Sorted Array is=");
			for (int num:arr) {
				System.out.println(num+" ");
			}
		System.out.println("Length of the Array is=");
		System.out.println(arr.length);
			}

		}

