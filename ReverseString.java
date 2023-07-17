package com.common_java_Programs;

public class ReverseString {

	public static void main(String[] args) {
		String str="ABCD";
		String rev=" ";
		
	int len=str.length();
		
		for(int i=len-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		
		// using Char Array
		char a[]= str.toCharArray();
		int lens= str.length();
		for(int i=lens-1;i>=0;i--){
			rev=rev+a[i];
		}
		System.out.println(rev);
		
		StringBuffer sb= new StringBuffer(str);
		StringBuffer revs=sb.reverse();
		System.out.println(revs);
		

}
}
