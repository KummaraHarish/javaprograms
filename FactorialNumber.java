package com.common_java_Programs;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num=5;
		long  fact=1;
		
		//for(int i=1;i<=num;i++){  // ascending order 5!= 1 * 2 * 3 * 4 * 5 = 120
		//	fact = fact*i;
		//}
		
		for(int i=num; i>=1; i--){		//descending order 5!= 5 * 4 * 3 * 2 * 1 = 120 
			fact= fact*i;
		}
		System.out.println("the factorial of given number is " + fact);
		
		
		
	}

}
