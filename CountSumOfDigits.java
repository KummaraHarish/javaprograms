package com.common_java_Programs;

public class CountSumOfDigits {

	public static void main(String[] args) {
		int num = 1234;

		int sum = 0;

		int result=0;
		while (num > 0) {
			
			sum = sum + num % 10;  //4 7 9

			num = num / 10;
		}
		System.out.println("the sum of given number is :" + sum);

	}

}
