package com.common_java_Programs;

import java.util.Arrays;

public class CheckArrayEqual2 {

	public static void main(String[] args) {
		int a[]={1,9,8,7,1};
		int b[]={1,9,8,7,1};
		
		boolean status= Arrays.equals(a, b);
		if(status== true){
			
			System.out.println("given arrays are equal");
		}
		else
		{
			
		System.out.println("given arrays are not equal");
		}

	}

}
