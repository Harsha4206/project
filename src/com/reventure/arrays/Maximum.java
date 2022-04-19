package com.reventure.arrays;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();

		}
		int max = 0;
		int k = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i + 1] - arr[i] > max) {
				max = arr[i + 1] - arr[i];
				k = i + 1;   

			} 

		}
		System.out.println(k);

	}

}
