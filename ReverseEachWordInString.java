package com.common_java_Programs;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		
		String str= "Welcome to java"; // original string
		String words[]= str.split(" "); //Spliting the words
		
		String reverseString="";
		
		for(String w: words)
		{
			
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--){
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+" ";
		
		}
		System.out.println("the reverse string is: "+reverseString);

	}

}
