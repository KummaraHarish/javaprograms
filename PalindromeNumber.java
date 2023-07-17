package com.common_java_Programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number : ");
	
	int num= sc.nextInt();
	
	int orginalnum= num;
	
	int rev=0;
	while(num!=0)
	{
		rev=rev*10 + num % 10;
		num=num/10;
	}
	
	if(orginalnum == rev){
		System.out.println(orginalnum +" "+ " is palindrome number");
	}
	else{
		System.out.println(orginalnum +" "+ "is not a palindrome number");
	}
		
	}

}
