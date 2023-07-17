package com.common_java_Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number : ");
		
		int num= sc.nextInt();
	
		int rev=0;
		while(num!=0){
			
			rev= rev*10 + num%10; //0*10 + 1234%10= 0+4=4 it will give the last number of digit
			num=num/10;		//num=1234/10= 123 // it will remove that last number of the digit
			
			
			//using StringBuffer calss
			StringBuffer sb= new StringBuffer(String.valueOf(num));
			StringBuffer revs=	sb.reverse();
			
			StringBuilder sb1= new StringBuilder();
			sb1.append(num);
			
			StringBuilder revss=	sb1.reverse();
		
		//System.out.println("the reverse of the number is : "+rev );
		System.out.println(revs);
		
		

	}

}
