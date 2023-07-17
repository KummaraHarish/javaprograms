package com.common_java_Programs;

public class LargestNumber2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 1170;
		int c = 140;

		int result= a>b?a:b;
		
		int finalresult=c>result?c:result;
		
		System.out.println("largest num is "+ finalresult);
		
		

}
}
