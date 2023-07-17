package com.common_java_Programs;

public class LinearSearchArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 40, 50, 30 };
		int key = 30;

		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				System.out.println("The element found at " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("The element not found");

		}
	}

}
