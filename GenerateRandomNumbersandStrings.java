package com.common_java_Programs;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumbersandStrings {

	public static void main(String[] args) {

		// using random class

		Random rand = new Random();
		int rand_int = rand.nextInt(1000);
	//	System.out.println(rand_int);
		
			double result= rand.nextDouble();
	//	System.out.println(result);
		
		//math class
	//	System.out.println(Math.random());
		
		//apache commoms-lang API
		
		String randomNum=RandomStringUtils.randomNumeric(5);
		//System.out.println(randomNum);
		
		String randomString=RandomStringUtils.randomAlphabetic(10);
		System.out.println(randomString);
	}

}
