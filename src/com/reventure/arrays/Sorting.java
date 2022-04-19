package com.reventure.arrays;

import java.util.Arrays;

public class Sorting {
	    
	public static void main(String[] args) {
		int [] arr1= new int[] {10 ,2,30,4,5,6};
		int [] arr2= new int[] {20 ,70,40,80,90};
		System.out.println("30 index:"+findindexValueOfayyas (arr1,arr2,30));
		
	}
	public static int findindexValueOfayyas(int[] arr1,int[] arr2,int searchValue) {
		int [] total= new int [ arr1.length+arr2.length];
		System.arraycopy(arr1, 0, total, 0,arr1.length );
		System.arraycopy(arr2, 0, total, arr1.length ,arr2.length );
		System.out.println( Arrays.toString(total));
		Arrays.sort(total);
		System.out.println(Arrays.toString(total));
		return Arrays.binarySearch(total,searchValue);
		
	}
}
