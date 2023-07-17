package com.common_java_Programs;

public class ReverseEachWordInString2 {

	public static void main(String[] args) {
		
		String str= "Welcome to java"; // original string
		String words[]= str.split(" "); //Spliting the words
		
		String reverseword=" ";
		for(String w:words){
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+sb.toString()+" ";
		}

		System.out.println(reverseword);
	}
	

}
