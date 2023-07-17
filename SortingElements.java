package com.common_java_Programs;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		/*int a[]={5,8,3,9,2,4};
		System.out.println("before sorting the array elements are "+Arrays.toString(a));
		
		Arrays.parallelSort(a);
		
		System.out.println("After sorting the array elements are "+Arrays.toString(a));*/
		
		//Approach two
		/*int a[]={5,8,3,9,2,4};
		System.out.println("before sorting the array elements are "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After sorting the array elements are "+Arrays.toString(a));*/
		
		//Reverse Descending order
		Integer a[]={5,8,3,9,2,4};
		System.out.println("before sorthing the array elemets are "+Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("After sorthing the array elemets are "+Arrays.toString(a));


	}

}
