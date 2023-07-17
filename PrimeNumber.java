package com.common_java_Programs;
// natural number 1
// which as only  2 factors  1 and itself
// 19 =>  1 and 19 only two factors it's prime number
// 28 => 1, 2,4, 7,14, 28 => not a prime number
public class PrimeNumber {

	public static void main(String[] args) {
		int num=44;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<num;i++){
				if(num%i == 0)
					count++;
			}
			if(count == 2){
				System.out.println("prime number");
			}
			else{
				System.out.println("not a prime number");
			}
		}
		else{
			System.out.println("not a prime number");
		}
	}
}


