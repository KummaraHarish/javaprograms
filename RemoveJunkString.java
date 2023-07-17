package com.common_java_Programs;

public class RemoveJunkString {

	public static void main(String[] args) {
		String s= "%^&^%$ java @&*^ 123 @@program 0987654567";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
