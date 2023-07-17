package com.common_java_Programs;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String str = "java is programming java ";
		int org_str = str.length();

		int final_str = str.replaceAll("a", "").length();

		int count = org_str - final_str;
		System.out.println("number of occurences of a is " + count);

	}

}
