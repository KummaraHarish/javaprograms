package com.common_java_Programs;

public class MaxandMinElementArray {

	public static void main(String[] args) {
		int a[]={50,300,40,20,60};
		
		/*int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max){
				max=a[i];
			}
		}
		System.out.println("The max record in array is "+max);*/
		
		//finding minimum value in array
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("The min record in array is "+min);

	}

}
