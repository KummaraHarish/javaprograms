package com.common_java_Programs;

import java.util.Scanner;

public class CountTheWordsString2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string: ");
		
		String s= sc.nextLine();
		
		int count=1;
		for(int i=0;i<s.length()-1;i++){
			if((s.charAt(i)== ' ') && (s.charAt(i+1)!=' ')){
				count++;
			}
		}
		System.out.println("number of words in given string is "+count);

}
}
