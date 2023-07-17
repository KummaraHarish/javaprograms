package com.common_java_Programs;

public class LargestNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 70;
		int c = 40;

		if (a > b && a > c)
		{
			System.out.println(a + " " + " a is big number");
		} 
		else if (b > a && b > c) 
		{
			System.out.println(b + " " + " b is big number");
		}
		else
		{
		System.out.println(c + " " + " c is big number");
		}

	}

}
