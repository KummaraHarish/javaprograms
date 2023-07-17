package com.common_java_Programs;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 3, 2, 4, 7, 5, 6 };
		System.out.println("before sorting the array elements are " + Arrays.toString(a));

		int n = a.length;
		for (int i = 0; i < n - 1; i++) { 	//Number of passes
			for (int j = 0; j < n - 1; j++) {	// Iteration in each path
				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println("after sorting the array elements are " + Arrays.toString(a));

	}

}
