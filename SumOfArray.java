package com.common_java_Programs;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,1};
		int sum=0;
		
		for(int i=0;i<a.length;i++){
			
			sum=sum+a[i];
			
		}
		
		// enhanced for loop
		
		//for(int value:a){
			//sum=sum+value;
		//}
		System.out.println("Sum of Array elements is: "+sum);

	}

}
