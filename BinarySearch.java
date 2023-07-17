package com.common_java_Programs;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]={10,20,30,40,50,60,70};
		
		boolean flag= false;
		
		int key=500;
		int l=0;
		int h=a.length-1;
		
		
		while(l<=h){
			int m= (l+h)/2;
			if(a[m]==key){
				System.out.println("the element found ");
				flag=true;
				break;
			}
			if(key>a[m]){
				l=m+1;
			}
			if(key<a[m]){
				h=m-1;
			}
		}
		
		if(flag == false){
			System.out.println("the elemnt not found");
		}

	}

}
