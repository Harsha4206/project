package com.reventure.arrays;

import java.util.*;

public class MaximumSum {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=0;
		for(int i=0;i<arr.length;i++) {
				result+=Math.pow(arr[i],i);
				}
		System.out.println(result);

	}
	}


