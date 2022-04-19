package com.reventure.arrays;

import java.util.Scanner;

public class Main {

	public static void insertingValuesArray(int[][] arr, String semname) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 6; i++) {
			for(int j=0;j<6;j++) {
			System.out.println("enter your marks" + semname + "  subjects" + (i + 1));
			arr[i][j] = scanner.nextInt();
			}
		}
	}

	public static void printingArrayValues(int[][] arr, String semname) {
		for (int i = 0; i < 6; i++) {
			for(int j=0;j<6;j++)
			System.out.println(semname + ", subjects" + (i + 1) + ":" + arr[i]);
		}
	}
	
		 
	      
	
	

	public static void main(String[] args) {
		int[][] sem1 = new int[6][6];
		int[][] sem2 = new int[6][6];
		insertingValuesArray(sem1, "semister1");
		insertingValuesArray(sem2, "semister2");
		printingArrayValues(sem1, "semister1");
		printingArrayValues(sem2, "semister2");
		
		
	}
}