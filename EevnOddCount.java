package com.common_java_Programs;

public class EevnOddCount {

	public static void main(String[] args) {
		int num=7654324;
		
		int even_count=0;
		int odd_count=0;
		int result=0;
		
		while(num>0){
			num=num/10;
			result=num;
			if(result % 2==0){
				even_count++;
			}
			else{
				odd_count++;
			}
		}
		System.out.println("the number of even count is "+even_count);
		
		System.out.println("the number of odd count is "+odd_count);
		

	}

}
