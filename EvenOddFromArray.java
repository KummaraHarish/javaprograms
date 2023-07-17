package com.common_java_Programs;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4,5,6,8};
		
		System.out.println("even numbers in array are...");
		
		/*for(int i=0;i<a.length;i++){
			
			if(a[i] % 2 == 0){
				System.out.println(a[i]);
			}
		}*/
		
		for(int value:a){
			if(value%2 ==0){
				System.out.println(value);
			}
		}
		System.out.println("odd numbers in array are ..");
		
		/*for(int i=0;i<a.length;i++){
			if(a[i]%2 !=0){
				System.out.println(a[i]);
			}
		}*/
		
		for(int result:a){
			if(result%2 !=0){
				System.out.println(result);
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
