package com.common_java_Programs;

public class MissingNumberInArray {

	public static void main(String[] args) {
		//Array should not have duplicates.
		//Array no need to follow sorted order
		//Values should be in range
		
		int a[]={1,2,3,4,5,7,8,9,10};
		//1+2+4+5=12 sum1
		//1+2+3+4+5=15 sum2
		//sum2-sum1=15-12= 3 is miising number
		
		int sum1=0;
		for(int i=0;i<a.length;i++){
			sum1=sum1+a[i];
			
		}
		System.out.println("sum of elements in array: "+ sum1);
		
		int sum2=0;
		for(int i=1;i<=10;i++){
			sum2=sum2+i;
		}
		System.out.println("sum of range of elements in array: "+ sum2);
		System.out.println("missing number  in array is : "+ (sum2-sum1));

	}

}
