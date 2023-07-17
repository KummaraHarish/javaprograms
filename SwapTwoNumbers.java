package com.common_java_Programs;

public class SwapTwoNumbers {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	
	System.out.println("before swapping the numbers are " +a +" "+b);
	//using third variable
	//int t=a;
	//b=t;
	
	//using - and + , without using third variable
	
	//a=a+b;	//a=10+20=30 now a=30;
	//b=a-b;	//b=30-20=10 now b=10;
	//a=a-b;	//a=30-10=20 now a=10;
	
	//using * / with out using third variable
	// here a and b values should not be zero
	
	//a=a*b;  //10*20=200
	//b=a/b;	//200/20=10		
	//a=a/b;	//200/10=20
	
	//using - bitwise XOR(^)
	//a=a^b;
	//b=a^b;
	//a=a^b;

	//using single statement
	//a=10, b=20
	b=a+b-(a=b);
	
	System.out.println("before swapping the numbers are " +a +" "+b );

	}

}
